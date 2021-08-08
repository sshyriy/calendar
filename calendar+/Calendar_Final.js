var element_month = $(".c-main");
var element_cell = $(".calendar_cell");
var element_object = new Date();
var month = element_object.getUTCMonth() + 1;
var day = element_object.getUTCDate();
var year = element_object.getUTCFullYear();
var element_month_value = month;
var calendar_plus_button = $(".c-today__btn");
var button_add = $(".js-event__add");
var button_save = $(".js-event__save");
var button_close = $(".js-event__close");
var popup_creator = $(".js-event__creator");
var date_value_for_input = $(this).data();
today = year + "-" + month + "-" + day;
var element_month_text = [
  "January",
  "February",
  "March",
  "April",
  "May",
  "June",
  "July",
  "August",
  "September",
  "October",
  "November",
  "December"
];

calendar_plus_button.on("click", function() {
  if (month < element_month_value) {
    var move = element_month_value % month;
    previous_function(move, true);
  } else if (month > element_month_value) {
    var move = month - element_month_value;
    moveNext(move, true);
  }
});

element_cell.each(function() {
  if ($(this).data("day") === today) {
    $(this).addClass("isToday");
    fillEventSidebar($(this));
  }
});

button_add.on("click", function() {
  popup_creator.addClass("isVisible");
  $("body").addClass("overlay");
  element_cell.each(function() {
    if ($(this).hasClass("isSelected")) {
      today = $(this).data("day");
      document.querySelector('input[type="date"]').value = today;
    } else {
      document.querySelector('input[type="date"]').value = today;
    }
  });
});
button_close.on("click", function() {
  popup_creator.removeClass("isVisible");
  $("body").removeClass("overlay");
});
button_save.on("click", function() {
  var name_for_input = $("input[name=name]").val();
  var date_value_for_input = $("input[name=date]").val();
  var notes_for_input = $("textarea[name=notes]").val();
  var tags_for_inputs = $("select[name=tags]")
    .find(":selected")
    .text();

  element_cell.each(function() {
    if ($(this).data("day") === date_value_for_input) {
      if (name_for_input != null) {
        $(this).attr("data-name", name_for_input);
      }
      if (notes_for_input != null) {
        $(this).attr("data-notes", notes_for_input);
      }
      $(this).addClass("event");
      if (tags_for_inputs != null) {
        $(this).addClass("event--" + tags_for_inputs);
      }
      fillEventSidebar($(this));
    }
  });

  popup_creator.removeClass("isVisible");
  $("body").removeClass("overlay");
  $("#addEvent")[0].reset();
});

function fillEventSidebar(self) {
  $(".c-aside__event").remove();
  var current_name = self.attr("data-name");
  var current_notes = self.attr("data-notes");
  var thisAnniversary = self.hasClass("event--Anniversary");
  var thisHoliday = self.hasClass("event--Holiday");
  var thisOther = self.hasClass("event--Other");
  var thisEvent = self.hasClass("event");
  
  switch (true) {
    case thisAnniversary:
      $(".c-aside__eventList").append(
        "<p class='c-aside__event c-aside__event--Anniversary'>" +
        current_name +
        " <span> • " +
        current_notes +
        "</span></p>"
      );
      break;
    case thisHoliday:
      $(".c-aside__eventList").append(
        "<p class='c-aside__event c-aside__event--Holiday'>" +
        current_name +
        " <span> • " +
        current_notes +
        "</span></p>"
      );
      break;
    case thisOther:
      $(".c-aside__eventList").append(
        "<p class='c-aside__event c-aside__event--Other'>" +
        current_name +
        " <span> • " +
        current_notes +
        "</span></p>"
      );
      break;
    case thisEvent:
      $(".c-aside__eventList").append(
        "<p class='c-aside__event'>" +
        current_name +
        " <span> • " +
        current_notes +
        "</span></p>"
      );
      break;
   }
};
element_cell.on("click", function() {
  var selected_element = $(this);
  var selected_day = $(this)
  .attr("data-day")
  .slice(8);
  var selected_month = $(this)
  .attr("data-day")
  .slice(5, 7);

  fillEventSidebar($(this));

  $(".c-aside__num").text(selected_day);
  $(".c-aside__month").text(element_month_text[selected_month - 1]);

  element_cell.removeClass("isSelected");
  selected_element.addClass("isSelected");

});

function moveNext(hover, forward_index) {
  for (var i = 0; i < hover; i++) {
    $(".c-main").css({
      left: "-=100%"
    });
    $(".calendar_paginator_for_month").css({
      left: "-=100%"
    });
    switch (true) {
      case forward_index:
        element_month_value += 1;
        break;
    }
  }
}
function previous_function(hover, previous_index) {
  for (var i = 0; i < hover; i++) {
    $(".c-main").css({
      left: "+=100%"
    });
    $(".calendar_paginator_for_month").css({
      left: "+=100%"
    });
    switch (true) {
      case previous_index:
        element_month_value -= 1;
        break;
    }
  }
}

function calendar_button_paginator(button_value, class_for_main, class_for_month_management, next, prev) {
  switch (true) {
    case next:
      $(button_value).on("click", function() {
        if (element_month_value >= 2) {
          $(class_for_main).css({
            left: "+=100%"
          });
          $(class_for_month_management).css({
            left: "+=100%"
          });
          element_month_value -= 1;
        }
        return element_month_value;
      });
      break;
    case prev:
      $(button_value).on("click", function() {
        if (element_month_value <= 11) {
          $(class_for_main).css({
            left: "-=100%"
          });
          $(class_for_month_management).css({
            left: "-=100%"
          });
          element_month_value += 1;
        }
        return element_month_value;
      });
      break;
  }
}

calendar_button_paginator("#next", element_month, ".calendar_paginator_for_month", false, true);
calendar_button_paginator("#prev", element_month, ".calendar_paginator_for_month", true, false);

moveNext(element_month_value - 1, false);

$(".c-aside__num").text(day);
$(".c-aside__month").text(element_month_text[month - 1]);

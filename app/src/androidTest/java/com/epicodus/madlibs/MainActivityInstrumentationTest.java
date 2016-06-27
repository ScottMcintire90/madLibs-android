package com.epicodus.madlibs;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

//    @Test
//    public void validateUserName() {
//        onView(withId(R.id.name)).perform(typeText("Charlie Murphy"))
//                .check(matches(withText("Charlie Murphy")));
//    }

    @Test
    public void inputIsSentToStoryActivity() {
        String name = "Charlie Murphy";
        String noun = "Chair";
        String verb = "walking";
        String number = "12";
        String animal = "Cat";
        onView(withId(R.id.name)).perform(typeText(name));
        onView(withId(R.id.noun)).perform(typeText(noun));
        onView(withId(R.id.animal)).perform(typeText(animal));
        onView(withId(R.id.number)).perform(typeText(number));
        onView(withId(R.id.verb)).perform(typeText(verb));
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.story)).check(matches(withText(name + " was walking along and saw a " + animal +" " + verb +" " + number + " times on a " + noun + ".")));



    }

}

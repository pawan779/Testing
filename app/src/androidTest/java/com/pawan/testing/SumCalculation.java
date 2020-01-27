package com.pawan.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class SumCalculation {

   @Rule
    public ActivityTestRule<Calculation>

    testRule=new ActivityTestRule<>(Calculation.class);

   @Test
    public void checkNos()
   {
       onView(withId(R.id.etFirst))
               .perform(typeText("12"));
       onView(withId(R.id.etSecond))
               .perform(typeText("10"));
       onView(withId(R.id.btnSum))
               .perform(click());

       onView(withId(R.id.tvResult))
               .check(matches(withText("22.0")));
   }

}

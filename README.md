[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23351421)
# Lab 14 - Pollution + Intro to Arrays

**Create a visual representation of data utilizing arrays**

_Learning Objective: Demonstrate an understanding of accessing array data (by indexing and looping) for output._

### Background:

![Graph depicting increase of atmospheric carbon dioxide](https://www.climate.gov/sites/default/files/BAMS_SOTC_2019_co2_paleo_1000px.jpg)

Since the year 1950, the concentration of atmospheric CO₂ has surpassed a level never before seen in the past millennia (depicted by the horizontal dotted line on the graph above). Back in the 1960s, the global growth rate of atmospheric carbon dioxide was roughly 0.6 ± 0.1 ppm per year, but in recent years, the growth rate has been 2.3 ppm per year.

This has had far reaching effects on the environment since almost half of the CO₂ emitted since 1850 remains in the atmosphere today, whereas the rest of it has partially dissolved in the world’s oceans.

This in turn has caused the ocean to lower its pH by 0.1 units, which is a 30% increase in acidity, since the start of the Industrial Revolution. This increase in acidity greatly affects marine life as it interferes with their ability to extract calcium from the water to build their shells and skeletons.

Information source from: [https://www.climate.gov/news-features/understanding-climate/climate-change-atmospheric-carbon-dioxide](https://www.climate.gov/news-features/understanding-climate/climate-change-atmospheric-carbon-dioxide)

![Image of the effect of ocean acidification on marine mollusks]
(https://www.climate.gov/sites/default/files/pteropod_comparison_620.jpg)

## Lab Prompt:
Create a bar graph depicting the average atmospheric CO₂ levels from the year 2001 to 2020.

## Lab Instructions:

### Step 1: Declare and Initialize Arrays
**Inside the main method**:
- Create an array of doubles called **co2Levels** to hold all 20 atmospheric CO2 values. Manually enter each value into the array according to the values provided in the comment above the main method.
- Create an array of integers called **years** to hold the year each value in the array above was measured (Ex. [2001, ..., 2020]). Instead of manually entering each integer into the array, use looping to assign the values to each index. (Clue: You can create a variable that starts at 2001 that increments every time the loop repeats.)

### Step 2: Create a Method called ``printBar`` to Print a single bar based on the amount of CO₂ in one year.
This method should accept a single parameter of type double. For every whole number over 360, print one oil drum (🛢) to the screen. To the right of the final oil drum, also print the data value.

For example, the value 371.32 ppm would have 11 oil drums printed in a line since 371.32-360 equals 11.32:

```
🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 371.32
```
*Note*: There is **one space** between the final oil drum and the value 371.32. 

### Step 3: Create a Method called ``printGraph`` to Print the Contents of both Arrays in the form of a bar graph
This method should accept two parameters, the array of data values and the array of years. It should use looping to access each index one by one, first printing the value at that index in the **years** array, followed by a space, then calling the ``printBar`` method with the value at that index in the **co2Levels** array passed as an argument.

For example, looping throught the first 8 indices of both arrays would produce the following output:

```
2001 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 371.32
2002 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 373.45
2003 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 375.98
2004 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 377.70
2005 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 379.98
2006 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 382.09
2007 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 384.03
2008 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 385.83
```

### Step 4: Call ``printGraph`` in main
In the main method:
- Below the column titles of the graph, call your ``printGraph`` method with the **co2Levels** array and **years** array passed as arguments.
- On the next line below the graph, add a statement that says:
```From 2001 to 2020, the average atmospheric CO₂ levels across the globe has grown 42.92 ppm.```
But instead of hardcoding 42.92, make the program flexible so that when the official world averages for coming years become available, it performs a calculation that subtracts the value at the beginning of the **co2Levels** array from the value at the end of the array (Do not actually update the values beyond 2020 or the test will break).

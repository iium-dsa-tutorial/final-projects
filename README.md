## Final Projects
----
#### This is where all of you needs to submit your source code and report.
----

Here is a short video **[link](https://www.youtube.com/watch?v=XdhuWDdu-rk)** that will show you how to upload your code here. Here is a [list of steps](https://education.github.com/guide/forks#3-completing-assignments) to be followed precsiely.

>
  1. At first, **fork** this repository
  2. Then **Clone** the forked repository from your account to your pc
  3. Then add all your project files and put your report in the README.md file
  4. **Push/Sync** all the changes you made to github
  5. Create a **Pull Request** on the original repository to complete submission

And here is a long video **[link](https://www.youtube.com/watch?v=73I5dRucCds)** in case you want to know more.

Before you commit your project, put your team name, name of all members and matric, project name and class section in README.md file. And put your team name in the description of the commit.

**At least one of your team member needs to have a GitHub account to be able to submit, do create an account.**

> Bring the [[DSA Project: Group Assessment.pdf](https://github.com/iium-dsa-tutorial/final-projects/blob/master/DSA%20Project-Group%20Assessment.pdf )] document with you in the presentation.

#### You have to fill up the following section - 
----

**Team Name:ANYTHING

**Project Name:PHOTOSHOP MAGIC WAND TOOL

**Section:4

**Members:**

  1. Mohib Ali Mowj (1214483)
  
  2. Ahmad hasrul yusdi bin Hassan 1519101
  
  3. Mohamad Rafic bin Hyrudeen 1423667
  
  4. 4.	Wan Muhammad Syukri bin Wan Nong 1328359
  
----

### Report



Algorithm Explanation
There are three languages that are being used in this project namely:
1. HTML
2. CSS
3. JAVASCRIPT


HTML
HTML is used as it’s the easiest language to visualize any interface. It’s shorter compared to others and can be displayed directly into the web. 
Magicwandtool.html contains top menu bar with File, Tools, View and Version buttons for the user to navigate in between.
There is one button to upload the image (Browse…)
Blur radius and threshold boxes are created for the user to manually adjust the tool as their desire.
Last feature is copy button where the user will be able to copy the cropped image and save it anywhere as their wish.

CSS
Mechanism to add more styles to web document.
1. cursor
2. position

JAVASCRIPT
Replaces PHP/servlet as the document which program the behavior/function of the web document.
Process the image inserted by the user
Process the blur radius
Process the threshold
Description of Major Functions/Classes

Program Interface
Consists of menu bar which contains buttons (File, Tools, View, Version1.0) which will redirect the page to another page.

Browse… button which will redirect to users’ local disk for uploading image process.

Blur radius and Threshold text boxes for the user to manually adjust the cursor/pointer as they crop the image.
Copy button to copy the cropped image.

Detail of Image Loading/Storing Process
img.on('load', function() 
We use the function to upload the image preferred by the user and then user can select the area which he/she wants to crop.


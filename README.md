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

**Team Name:**

**Project Name:**

**Section:**

**Members:**

  1. Name (Matric)
  
  2. Name (Matric)
  
  3. Name (Matric)
  
  4. Name (Matric)
  
----

### Report

> Your Project Report Goes Here

----our project code
	<!DOCTYPE html> 
	<html> 
	<head> 
	<script Langualge = "javaScript"> 
	
	flag = 0; 
	function openpara(val) 
	{ 
	calc.display.value+=val; 
	flag+=1; 
	} 
	function closepara(valval) 
	{ 
	calc.display.value+=valval; 
	flag-=1; 
	} 
	function backspace(calc) 
	{ 
	var size = calc.display.value.length; 
	calc.display.value=calc.display.value.substring(0,size-1); 
	} 
	function Resetfunction(calc) 
	{ 
	calc.display.value=""; 
	flag=0; 
	} 
	function cos_function() 
	{ 
	flag+=1; 
	calc.display.value+='Math.cos('; 
	} 
	function sin_function() 
	{ 
	flag+=1; 
	calc.display.value+='Math.sin('; 
	} 
	function tan_function() 
	{ 
	flag+=1; 
	calc.display.value+='Math.tan('; 
	} 
	function log_function() 
	{ 
	flag+=1; 
	calc.display.value+='Math.log('; 
	} 
	function sqrt_function() 
	{ 
	flag+=1; 
	calc.display.value+='Math.sqrt('; 
	} 
	function exp_function() 
	{ 
	flag+=1; 
	calc.display.value+='Math.exp('; 
	} 
	function fact(x) 
	{ 
	factvar=1; 
	for (i=1;i<=x;i++) 
	{ 
	factvar=factvar*i; 
	} 
	return factvar; 
	} 
	function fact_function(x) 
	{ 
	flag+=1; 
	calc.display.value+='fact('; 
	} 
	function power_function(x) 
	{ 
	flag+=1; 
	calc.display.value+='Math.pow(x,y'; 
	} 
	function evaluation(calc) 
	{ 
	n = calc.display.value; 
	var size = calc.display.value.length; 
	var lastchar = calc.display.value.charAt(size) 
	if(isNaN(lastchar) && lastchar!=")" && lastchar!="!") {calc.display.value="syntax error";} 
	else if(flag!=0){calc.display.value="error:paranthesis";} 
	else { 
	result=eval(n); 
	calc.display.value=result;} 
	} 
	</script> 
	<style> 
	*{ 
	padding:0; 
	margin:0; 
	} 
	body { 
	text-align:center; 
	background-color:brown; 
	} 
	#heading { 
	margin-top:10px; 
	} 
	#form_wrapper { 
	width:600px; 
	height:540px; 
	
	margin:30px auto auto 420px; 
	background-color:red; 
	text-align:center; 
	border-radius:10px; 
	border-right:2px groove #333; 
	box-shadow:4px 4px 2px #666666; 
	} 
	#formone{ 
	padding-top:25px; 
	} 
	#display { 
	width:553px; 
	height:60px; 
	font-size:30px; 
	color:balck; 
	margin:4px; 
	border:2px inset black; 
	border-bottom:1px inset #FFF; 
	border-right:1px inset #FFF; 
	background-color:#D5F192; 
	} 
	.button { 
	width:60px; 
	height:60px; 
	margin:1px; 
	} 
	
	#btn{ 
	font-size:25px; 
	padding:5px; 
	height:70px; 
	width:90px; 
	background-color:white; 
	
	
	} 
	
	#btn_f{ 
	height:70px; 
	width:90px; 
	font-size:20px; 
	padding:5px; 
	margin-left:auto; 
	margin-right:auto; 
	background-color:yellow; 
	} 
	
	#result{ 
	height:60px; 
	width:453px; 
	font-size:25px; 
	padding:5px; 
	
	
	} 
	</style> 
	</head> 
	<body> 
	<div id="big_wrapper"> 
	<h1 id="heading">SCIENTIFIC CALCULATOR</h1> 
	<div id="form_wrapper"> 
	<form id="formone" name="calc"> 
	<input id="display" type="text" name="display” value=" disabled contenteditable="false" > 
	<br> 
	<input id="btn" type="button" value="6" onClick="calc.display.value+=6"> 
	<input id="btn" type="button" value="7" onClick="calc.display.value+=7"> 
	<input id="btn" type="button" value="8" onClick="calc.display.value+=8"> 
	<input id="btn" type="button" value="9" onClick="calc.display.value+=9"> 
	<input id="btn" type="button" value="(" onClick="openpara(this.value)"> 
	<input id="btn" type="button" value=")" onClick="closepara(this.value)"> 
	
	<br> 
	<input id="btn" type="button" value="2" onClick="calc.display.value+=2"> 
	<input id="btn" type="button" value="3" onClick="calc.display.value+=3"> 
	<input id="btn" type="button" value="4" onClick="calc.display.value+=4"> 
	<input id="btn" type="button" value="5" onClick="calc.display.value+=5"> 
	<input id="btn" type="button" value="1" onClick="calc.display.value+=1"> 
	<input id="btn" type="button" value="0" onClick="calc.display.value+=0"> 
	
	<br> 
	<input id="btn" type="button" value="+" onClick="calc.display.value+='+'"> 
	<input id="btn" type="button" value="/" onClick="calc.display.value+='/'"> 
	<input id="btn" type="button" value="-" onClick="calc.display.value+='-'"> 
	<input id="btn" type="button" value="*" onClick="calc.display.value+='*'"> 
	<input id="btn" type="button" value="." onClick="calc.display.value+='.'"> 
	<input id="btn" type="button" value="%" onClick="calc.display.value+='%'"> 
	
	
	
	<br> 
	<input id="btn" type="button" value="sin" onClick="sin_function()"> 
	<input id="btn" type="button" value="cos" onClick="cos_function()"> 
	<input id="btn" type="button" value="tan" onClick="tan_function()"> 
	<input id="btn" type="button" value="sqrt" onClick="sqrt_function()"> 
	<input id="btn" type="button" value="n!" onClick="fact_function()"> 
	<input id="btn" type="button" value="E" onClick="calc.display.value+=2.718"> 
	
	<br> 
	<input id="btn" type="button" value="log" onClick="log_function()"> 
	<input id="btn" type="button" value="&#928" onClick="calc.display.value+=3.141"> 
	<input id="btn" type="button" value="x^y" onClick="power_function()"> 
	<input id="btn" type="button" value="log2E" onClick="calc.display.value+=1.442"> 
	<input id="btn" type="button" value="log10E" onClick="calc.display.value+=0.434"> 
	<input id="btn" type="button" value="EXP" onClick="exp_function"> 
	
	
	<br> 
	<input id="btn" type="button" value="," onClick="calc.display.value+=','"> 
	<input id="btn" type="button" value="LN2" onClick="calc.display.value+=0.693"> 
	<input id="btn" type="button" value="LN10" onClick="calc.display.value+=2.302"> 
	<input id="btn_f" type="button" value="Clear" onClick="Resetfunction(this.form)"> 
	<input id="btn_f" type="button" value="Back" onClick="backspace(this.form)"> 
	<input id="btn_f" type="button" value="Enter" onClick="evaluation(this.form)"> 
	</center> 
	</form> 
	</div> 
	</div> 
	</body> 
	</html> 
	



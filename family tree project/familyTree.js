/*
This project is Family Three
developed by NHF group
*/

var del=0;
// Test there is local storage variable key called delcount or not
if(localStorage.delcount){
  if (localStorage.delcount>0) {
    //decrease by 1 and store it back as integer
    localStorage.delcount = Number(localStorage.delcount) - 1;
    del = Number(localStorage.delcount);
  }else{
    del=0;
    localStorage.delcount = Number(0); 
  } 
}
//an object that store multiple variable
var person = {
    id:'',
    name:'',
    type:'',
    gender:'',
    setId : function(id){
        this.id = id;
    },
    getId: function(){
        return this.id;
    },
    setName: function(name){
        this.name = name;
    },
    getName: function(){
        return this.name;
    },
    setType: function(type){
        this.type = type;
    },
    getType: function(){
        return this.type;
    },
    setGender: function(gender){
        this.gender = gender;
    },
    getGender: function(){
        return this.gender;
    },
    display: function(){
        document.getElementById("viewName").innerHTML = (person.getName());
        document.getElementById("viewType").innerHTML = (person.getType());
        document.getElementById("viewGender").innerHTML = (person.getGender());
    }
}
//get value that user entered
function getInfoFromHtml(){
    person.setName(document.getElementById("name").value);
    person.setType(document.getElementById("type").value);
    person.setGender(document.getElementById("gender").value);
}

//add person by called function saveFamilytoStorage()
function personInfo(){
    getInfoFromHtml();
    saveFamilytoStorage();
    if(localStorage.delcount>0){
        localStorage.delcount = Number(localStorage.delcount)-1;
        del = Number(localStorage.delcount);
    }else{
        del=0;
        localStorage.delcount = 0;
    }
    person.display();
}

//this function is to save family to localStorage
function saveFamilytoStorage(){
    var family = new Array;
    family = [{
        name: person.getName(),
        type: person.getType(),
        gender: person.getGender()
    }];
    var pId;
    var once = Boolean(0);
    for(var i =1; i<=(localStorage.length+del+1); i++){
        pId = "id" + i;
        if(!localStorage.getItem(pId) && !once){
            localStorage.setItem(pId, JSON.stringify(family));
            alert("the member have been added to storage");
            once =!once;
            i=localStorage.length+del+1;
        }
        
    }
}

//this function is to view all member that have been store in localStorage
function viewFamily(){
   var db = [];
   var pId;
   document.getElementById("listMember").innerHTML = "";
   for(var i=0;i<=localStorage.length+del; i++){
       pId = "id"+i;
       if(localStorage.getItem(pId)){
           db = localStorage.getItem(pId);
           db = JSON.parse(db);
           var note = document.createElement("table");
           var text= document.createTextNode(
               "id"+ i+
               "  Name: "+db[0].name
               );
            note.appendChild(text);
            document.getElementById("listMember").appendChild(note);
       }

   }
}

//this function is to find member that are in storage according to chosen question
function findMember(){
     var question = parseInt(document.getElementById("findType").value);
     var findType;
     var findGender;
     var text;
     if(question == 1){
         alert("find grandfather");
         findType = 0;
         findGender = 'male';
         for(var i=0;i<=localStorage.length+del; i++){
         pId = "id"+i;
         if(localStorage.getItem(pId)){
           db = localStorage.getItem(pId);
           db = JSON.parse(db);
           if(db[0].type == findType && db[0].gender == findGender){
           text="My grandfather's "+
               "name is "+db[0].name;
            document.getElementById("displayArray").innerHTML = text;
                }
            }
         }
     }else if(question == 2){
         alert("find grandmother");
         findType = 0;
         findGender = 'female';
         for(var i=0;i<=localStorage.length+del; i++){
         pId = "id"+i;
         if(localStorage.getItem(pId)){
           db = localStorage.getItem(pId);
           db = JSON.parse(db);
           if(db[0].type == findType && db[0].gender == findGender){
           var text = "My grandmother's "+
               "name is "+db[0].name;
            document.getElementById("displayArray").innerHTML = text;}
            }
         }
     }else if(question == 3){
         alert("find father");
         findType = 1;
         findGender = 'male';
         for(var i=0;i<=localStorage.length+del; i++){
         pId = "id"+i;
         if(localStorage.getItem(pId)){
           db = localStorage.getItem(pId);
           db = JSON.parse(db);
           if(db[0].type == findType && db[0].gender == findGender){
           var text = "My father's "+
               "name is "+db[0].name;
            document.getElementById("displayArray").innerHTML = text;}
            }
         }
     }else if(question == 4){
         alert("find mother");
         findType = 1;
         findGender = 'female';
         for(var i=0;i<=localStorage.length+del; i++){
         pId = "id"+i;
         if(localStorage.getItem(pId)){
           db = localStorage.getItem(pId);
           db = JSON.parse(db);
           if(db[0].type == findType && db[0].gender == findGender){
           var text = "My mother's "+
               "name is "+db[0].name;
            document.getElementById("displayArray").innerHTML = text;}
            }
         }
     }else if(question == 5){
         alert("find sibling");
         findType = 2;
         var count=0;
         for(var i=0;i<=localStorage.length+del; i++){
         pId = "id"+i;
         if(localStorage.getItem(pId)){
           db = localStorage.getItem(pId);
           db = JSON.parse(db);
           if(db[0].type == findType){
               count++;
               var note = document.createElement("table");
               var text= document.createTextNode(
               "Name: "+db[0].name+
               " Gender: "+db[0].gender
               );
            note.appendChild(text);
            document.getElementById("displayArray").appendChild(note);
          }
          var countsibling = "I have " + count + " sibling<br>";
          document.getElementById("siblingcount").innerHTML = countsibling;
            }
         }
     }else{
         alert("please select the question");
     }
}

//function for reset button 
function resetBtn() {
    document.getElementById("addMember").reset();
}

name= prompt("Aapka naam kya hai 🙄");

if(name != "null")
{
age= prompt("Aapki umar kya hai 🤔");
}
else{
document.write("Name: 'Aapne apna naam daala he nhi!!'");
}

if(age != "null")
{
  if(age>=18)
  {
	alert("Congratulations🥳,You can Use this Website");
	document.write("Name: "+ name + "<br>"+ "Age: " + age);
  }
  else{
	alert("Beta jao Lollipop Khao🤣😂");
	document.write("Abe gya nhi abhi tak ??");
  }

}



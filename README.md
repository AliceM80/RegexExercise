# RegexExercise

### Solution1 using rgex : preferred!!
public static String findtheTrapS1 (String sourceText);

return m.find() ? "Boo!" : "Relax, there is no trap"; OR

if(m.find()){
 return "BOO!";
}else {
return "Relax, there`no trap";
}

### Solution2 using indexOf:
public static String findtheTrapS2(String sourceText);



### Solution 3 using contains:
public static String findtheTrapS3(String sourceText);
if(sourcetext.toLowerCase().contains("trap)){
sout("BOO !");
return "BOO!";
}else{
sout ("Relax");
return "Relax";
}


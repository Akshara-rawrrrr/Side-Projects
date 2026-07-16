public class MadLibs {
    /*
  This program is to simulate a Mad Libs word Game
  By: Akshara Bharath
  Date: 6/29/2026
    */
    public static void main(String[] args){
      
      String name1 = "Akshara";
      String adjective1 = "grodgy";
      String adjective2 = "annoying";
      String adjective3 = "peppy";
      String verb1 = "dance";
      String noun1 = "people";
      String noun2 = "carriages";
      String noun3 = "horses";
      String noun4 = "sushi";
      String noun5 = "sidewalk";
      String noun6 = "helicopter";
      String name2 = "Telemicus";
      int number = 5;
      String place1 = "beach";
  
      
      //The template for the story
      String story = "This morning "+name1+"
       woke up feeling "+adjective1+". 
       'It is going to be an "+adjective2+" day!'
        Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. 
        They began to "+verb1+" to the rhythm of the "+noun3+", 
        which made all the "+noun4+"s very "+adjective3+".
         Concerned, "+name1+" texted "+name2+", 
         who flew "+name1+" to "+place1+" 
         and dropped "+name1+" in a puddle of frozen "+noun5+". 
         "+name1+" woke up in the year "+number+", 
         in a world where "+noun6+"s ruled the world.";
  
      System.out.println(story);
    }       
  }
  
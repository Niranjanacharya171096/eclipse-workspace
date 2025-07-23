package bean;

public class TechBean {
  String name;
  String lang;
  public TechBean () //recommended to write
  {
  }
  public void setName (String name) {
    this.name=name;
  }
  public void setLang (String lang) {
    this.lang=lang;
  }
  public String getName () {
    System.out.println(name);
    return name;
  }
  public String getLang () {
    System.out.println(lang);
    return lang;
  }
  public String getLangComments () {
    if (lang.equals ("c")) {
      return ("Use TutorialPoints");
    }
    else if (lang.equals ("c++")) {
      return ("Use GeeksforGeeks");
    }
    else if (lang.equals ("java")) {
      return ("Use Javatpoint");
    }
    else if (lang.equals (".net")) {
      return ("Use w3schools");
    }
    else {
      return ("No idea..!");
    }
  }
}

public class Treasure{
    private int value;
    private String title;
  
    public Treasure(String title, int value){
      this.value = value;
      this.title = title;
    }
   public Treasure(String title) {
      this.value = 50;
    }
    public int getValue() {
      return this.value;
    }
    public String title() {
        return this.title;
      }
    public void setValue(int value){
      this.value=value;
    }
    public void title(String title){
        this.title=title;
      }
      @Override
      public String toString(){
        return this.title;
      }

  }
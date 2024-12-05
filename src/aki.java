public class aki extends akf {
   public aki(int var1, String var2, akb var3) {
      super(var1, var2, var3);
   }

   public aki(int var1, String var2) {
      super(var1, var2);
   }

   public akf new() {
      super.new();
      aka.s.add(this);
      return this;
   }
}

public class n7 extends n4 {
   public String[] i = new String[]{"", "", "", ""};
   public int h = -1;
   private boolean j = true;

   public void do(aqv var1) {
      super.do(var1);
      var1.a("Text1", this.i[0]);
      var1.a("Text2", this.i[1]);
      var1.a("Text3", this.i[2]);
      var1.a("Text4", this.i[3]);
   }

   public void a(aqv var1) {
      this.j = false;
      super.a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.i[var2] = var1.new("Text" + (var2 + 1));
         if (this.i[var2].length() > 15) {
            this.i[var2] = this.i[var2].substring(0, 15);
         }
      }

   }

   public an7 char() {
      String[] var1 = new String[4];
      System.arraycopy(this.i, 0, var1, 0, 4);
      return new ang(this.new, this.int, this.for, var1);
   }

   public boolean m() {
      return this.j;
   }

   public void a(boolean var1) {
      this.j = var1;
   }
}

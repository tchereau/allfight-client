class g6 extends Thread {
   // $FF: synthetic field
   final g8 a;

   g6(g8 var1) {
      this.a = var1;
   }

   public void run() {
      gv var1 = new gv(g8.case(this.a).vg);

      try {
         g8.a(this.a, var1.if());
      } catch (Exception var3) {
         g8.a(this.a, 0);
      }

   }
}

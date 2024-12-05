import java.util.concurrent.Callable;

class ala implements Callable {
   // $FF: synthetic field
   final int if;
   // $FF: synthetic field
   final alb a;

   ala(alb var1, int var2) {
      this.a = var1;
      this.if = var2;
   }

   public String a() {
      String var1 = "Once per " + this.if + " ticks";
      if (this.if == Integer.MAX_VALUE) {
         var1 = "Maximum (" + var1 + ")";
      }

      return var1;
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}

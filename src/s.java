import java.util.Map;

class s extends Thread {
   // $FF: synthetic field
   final Map if;
   // $FF: synthetic field
   final u a;

   s(u var1, Map var2) {
      this.a = var1;
      this.if = var2;
   }

   public void run() {
      try {
         u.a(this.a, this.if, u.for(this.a), u.do(this.a), u.new(this.a));
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         u.a(this.a, false);
      }

   }
}

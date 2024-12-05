import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;

public class hf {
   private volatile boolean if = false;
   private hd a;
   private Timer new = new Timer();
   private List int = new ArrayList();
   private boolean for = false;
   private j7 do;

   public hf(j7 var1) {
      this.do = var1;
      this.a = new hd(this, (he)null);
      this.new.schedule(this.a, 0L, 10000L);
   }

   public synchronized boolean if() {
      return this.for;
   }

   public synchronized void do() {
      this.for = false;
   }

   public synchronized List a() {
      return Collections.unmodifiableList(this.int);
   }

   private synchronized void a(List var1) {
      if (!var1.equals(this.int)) {
         this.int = var1;
         this.for = true;
      }

   }

   public synchronized void for() {
      this.if = true;
      this.a.cancel();
      this.new.cancel();
   }

   // $FF: synthetic method
   static j7 if(hf var0) {
      return var0.do;
   }

   // $FF: synthetic method
   static boolean a(hf var0) {
      return var0.if;
   }

   // $FF: synthetic method
   static void a(hf var0, List var1) {
      var0.a(var1);
   }
}

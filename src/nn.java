import java.util.Comparator;
import java.util.List;

public class nn {
   public static final Comparator if = new nm();
   private final nl a;
   private final np int;
   private final String for;
   private int do;

   public nn(nl var1, np var2, String var3) {
      this.a = var1;
      this.int = var2;
      this.for = var3;
   }

   public void do(int var1) {
      if (this.int.a().if()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.a(this.for() + var1);
      }
   }

   public void if(int var1) {
      if (this.int.a().if()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.a(this.for() - var1);
      }
   }

   public void if() {
      if (this.int.a().if()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.do(1);
      }
   }

   public int for() {
      return this.do;
   }

   public void a(int var1) {
      int var2 = this.do;
      this.do = var1;
      if (var2 != var1) {
         this.a().a(this);
      }

   }

   public np int() {
      return this.int;
   }

   public String do() {
      return this.for;
   }

   public nl a() {
      return this.a;
   }

   public void a(List var1) {
      this.a(this.int.a().a(var1));
   }
}

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class no {
   private final nl if;
   private final String a;
   private final Set byte = new HashSet();
   private String try;
   private String new = "";
   private String int = "";
   private boolean for = true;
   private boolean do = true;

   public no(nl var1, String var2) {
      this.if = var1;
      this.a = var2;
      this.try = var2;
   }

   public String try() {
      return this.a;
   }

   public String new() {
      return this.try;
   }

   public void do(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.try = var1;
         this.if.for(this);
      }
   }

   public Collection int() {
      return this.byte;
   }

   public String do() {
      return this.new;
   }

   public void if(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Prefix cannot be null");
      } else {
         this.new = var1;
         this.if.for(this);
      }
   }

   public String a() {
      return this.int;
   }

   public void a(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Suffix cannot be null");
      } else {
         this.int = var1;
         this.if.for(this);
      }
   }

   public static String a(no var0, String var1) {
      return var0 == null ? var1 : var0.do() + var1 + var0.a();
   }

   public boolean for() {
      return this.for;
   }

   public void if(boolean var1) {
      this.for = var1;
      this.if.for(this);
   }

   public boolean if() {
      return this.do;
   }

   public void a(boolean var1) {
      this.do = var1;
      this.if.for(this);
   }

   public int byte() {
      int var1 = 0;
      int var2 = 0;
      if (this.for()) {
         var1 |= 1 << var2++;
      }

      if (this.if()) {
         var1 |= 1 << var2++;
      }

      return var1;
   }

   public void a(int var1) {
      byte var2 = 0;
      int var3 = var2 + 1;
      this.if((var1 & 1 << var2) > 0);
      this.a((var1 & 1 << var3++) > 0);
   }
}

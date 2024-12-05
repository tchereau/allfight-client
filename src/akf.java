import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class akf {
   public final int new;
   private final String char;
   public boolean int;
   public String for;
   private final akb case;
   private static NumberFormat byte;
   public static akb do;
   private static DecimalFormat try;
   public static akb if;
   public static akb a;

   public akf(int var1, String var2, akb var3) {
      this.int = false;
      this.new = var1;
      this.char = var2;
      this.case = var3;
   }

   public akf(int var1, String var2) {
      this(var1, var2, do);
   }

   public akf if() {
      this.int = true;
      return this;
   }

   public akf new() {
      if (aka.u.containsKey(this.new)) {
         throw new RuntimeException("Duplicate stat id: \"" + ((akf)aka.u.get(this.new)).char + "\" and \"" + this.char + "\" at id " + this.new);
      } else {
         aka.t.add(this);
         aka.u.put(this.new, this);
         this.for = aj9.a(this.new);
         return this;
      }
   }

   public boolean do() {
      return false;
   }

   public String a(int var1) {
      return this.case.a(var1);
   }

   public String a() {
      return this.char;
   }

   public String toString() {
      return aqz.if(this.char);
   }

   // $FF: synthetic method
   static NumberFormat for() {
      return byte;
   }

   // $FF: synthetic method
   static DecimalFormat int() {
      return try;
   }

   static {
      byte = NumberFormat.getIntegerInstance(Locale.US);
      do = new ake();
      try = new DecimalFormat("########0.00");
      if = new akd();
      a = new akc();
   }
}

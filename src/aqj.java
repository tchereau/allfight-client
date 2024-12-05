import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum aqj {
   p('0'),
   o('1'),
   n('2'),
   m('3'),
   l('4'),
   k('5'),
   j('6'),
   i('7'),
   h('8'),
   g('9'),
   f('a'),
   e('b'),
   d('c'),
   c('d'),
   b('e'),
   void('f'),
   goto('k', true),
   char('l', true),
   byte('m', true),
   try('n', true),
   new('o', true),
   int('r');

   private static final Map for = new HashMap();
   private static final Map do = new HashMap();
   private static final Pattern if = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
   private final char a;
   private final boolean long;
   private final String else;

   public static aqj[] if() {
      return (aqj[])case.clone();
   }

   private aqj(char var3) {
      this(var3, false);
   }

   private aqj(char var3, boolean var4) {
      this.a = var3;
      this.long = var4;
      this.else = "§" + var3;
   }

   public char a() {
      return this.a;
   }

   public boolean int() {
      return this.long;
   }

   public boolean for() {
      return !this.long && this != int;
   }

   public String do() {
      return this.name().toLowerCase();
   }

   public String toString() {
      return this.else;
   }

   public static aqj a(String var0) {
      return var0 == null ? null : (aqj)do.get(var0.toLowerCase());
   }

   public static Collection a(boolean var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      aqj[] var3 = if();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         aqj var6 = var3[var5];
         if ((!var6.for() || var0) && (!var6.int() || var1)) {
            var2.add(var6.do());
         }
      }

      return var2;
   }

   static {
      aqj[] var0 = if();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         aqj var3 = var0[var2];
         for.put(var3.a(), var3);
         do.put(var3.do(), var3);
      }

   }
}

import java.util.ArrayList;
import java.util.List;

public class akk {
   public static int s;
   public static int r;
   public static int q;
   public static int p;
   public static List o = new ArrayList();
   public static akl n;
   public static akl m;
   public static akl l;
   public static akl k;
   public static akl j;
   public static akl i;
   public static akl h;
   public static akl g;
   public static akl f;
   public static akl e;
   public static akl d;
   public static akl b;
   public static akl long;
   public static akl else;
   public static akl case;
   public static akl try;
   public static akl int;
   public static akl for;
   public static akl do;
   public static akl if;
   public static akl a;
   public static akl c;
   public static akl void;
   public static akl goto;
   public static akl char;
   public static akl byte;
   public static akl new;

   public static void a() {
   }

   static {
      n = (new akl(0, "openInventory", 0, 0, abr.cm, (akl)null)).byte().case();
      m = (new akl(1, "mineWood", 2, 1, pa.aM, n)).case();
      l = (new akl(2, "buildWorkBench", 4, -1, pa.cu, m)).case();
      k = (new akl(3, "buildPickaxe", 4, 2, abr.B, l)).case();
      j = (new akl(4, "buildFurnace", 3, 4, pa.cq, k)).case();
      i = (new akl(5, "acquireIron", 1, 4, abr.N, j)).case();
      h = (new akl(6, "buildHoe", 2, -3, abr.aQ, l)).case();
      g = (new akl(7, "makeBread", -1, -3, abr.aC, h)).case();
      f = (new akl(8, "bakeCake", 0, -5, abr.a7, h)).case();
      e = (new akl(9, "buildBetterPickaxe", 6, 2, abr.t, k)).case();
      d = (new akl(10, "cookFish", 2, 6, abr.ca, j)).case();
      b = (new akl(11, "onARail", 2, 3, pa.cm, i)).else().case();
      long = (new akl(12, "buildSword", 6, -1, abr.G, l)).case();
      else = (new akl(13, "killEnemy", 8, -1, abr.b8, long)).case();
      case = (new akl(14, "killCow", 7, -3, abr.cs, long)).case();
      try = (new akl(15, "flyPig", 8, -4, abr.cx, case)).else().case();
      int = (new akl(16, "snipeSkeleton", 7, 0, abr.W, else)).else().case();
      for = (new akl(17, "diamonds", -1, 5, abr.P, i)).case();
      do = (new akl(18, "portal", -1, 7, pa.bs, for)).case();
      if = (new akl(19, "ghast", -4, 8, abr.aB, do)).else().case();
      a = (new akl(20, "blazeRod", 0, 9, abr.aD, do)).case();
      c = (new akl(21, "potion", 2, 8, abr.av, a)).case();
      void = (new akl(22, "theEnd", 3, 10, abr.b3, a)).else().case();
      goto = (new akl(23, "theEnd2", 4, 13, pa.bE, void)).else().case();
      char = (new akl(24, "enchantments", -4, 4, pa.bQ, for)).case();
      byte = (new akl(25, "overkill", -4, 1, abr.bd, char)).else().case();
      new = (new akl(26, "bookcase", -3, 6, pa.bx, char)).case();
      System.out.println(o.size() + " achievements");
   }
}

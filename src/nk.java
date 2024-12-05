import java.util.Collection;
import java.util.Iterator;

public class nk extends s0 {
   private nl d;
   private aqv c;

   public nk() {
      this("scoreboard");
   }

   public nk(String var1) {
      super(var1);
   }

   public void a(nl var1) {
      this.d = var1;
      if (this.c != null) {
         this.if(this.c);
      }

   }

   public void if(aqv var1) {
      if (this.d == null) {
         this.c = var1;
      } else {
         this.a(var1.void("Objectives"));
         this.do(var1.void("PlayerScores"));
         if (var1.try("DisplaySlots")) {
            this.for(var1.char("DisplaySlots"));
         }

         if (var1.try("Teams")) {
            this.if(var1.void("Teams"));
         }

      }
   }

   protected void if(aqm var1) {
      for(int var2 = 0; var2 < var1.for(); ++var2) {
         aqv var3 = (aqv)var1.a(var2);
         no var4 = this.d.int(var3.new("Name"));
         var4.do(var3.new("DisplayName"));
         var4.if(var3.new("Prefix"));
         var4.a(var3.new("Suffix"));
         if (var3.try("AllowFriendlyFire")) {
            var4.if(var3.if("AllowFriendlyFire"));
         }

         if (var3.try("SeeFriendlyInvisibles")) {
            var4.a(var3.if("SeeFriendlyInvisibles"));
         }

         this.a(var4, var3.void("Players"));
      }

   }

   protected void a(no var1, aqm var2) {
      for(int var3 = 0; var3 < var2.for(); ++var3) {
         this.d.if(((aqf)var2.a(var3)).do, var1);
      }

   }

   protected void for(aqv var1) {
      for(int var2 = 0; var2 < 3; ++var2) {
         if (var1.try("slot_" + var2)) {
            String var3 = var1.new("slot_" + var2);
            np var4 = this.d.byte(var3);
            this.d.a(var2, var4);
         }
      }

   }

   protected void a(aqm var1) {
      for(int var2 = 0; var2 < var1.for(); ++var2) {
         aqv var3 = (aqv)var1.a(var2);
         nh var4 = (nh)nh.if.get(var3.new("CriteriaName"));
         np var5 = this.d.a(var3.new("Name"), var4);
         var5.a(var3.new("DisplayName"));
      }

   }

   protected void do(aqm var1) {
      for(int var2 = 0; var2 < var1.for(); ++var2) {
         aqv var3 = (aqv)var1.a(var2);
         np var4 = this.d.byte(var3.new("Objective"));
         nn var5 = this.d.a(var3.new("Name"), var4);
         var5.a(var3.goto("Score"));
      }

   }

   public void a(aqv var1) {
      if (this.d == null) {
         net.minecraft.a.a.g2().a().if("Tried to save scoreboard without having a scoreboard...");
      } else {
         var1.a("Objectives", (aqd)this.byte());
         var1.a("PlayerScores", (aqd)this.char());
         var1.a("Teams", (aqd)this.case());
         this.do(var1);
      }
   }

   protected aqm case() {
      aqm var1 = new aqm();
      Collection var2 = this.d.int();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         no var4 = (no)var3.next();
         aqv var5 = new aqv();
         var5.a("Name", var4.try());
         var5.a("DisplayName", var4.new());
         var5.a("Prefix", var4.do());
         var5.a("Suffix", var4.a());
         var5.a("AllowFriendlyFire", var4.for());
         var5.a("SeeFriendlyInvisibles", var4.if());
         aqm var6 = new aqm();
         Iterator var7 = var4.int().iterator();

         while(var7.hasNext()) {
            String var8 = (String)var7.next();
            var6.a((aqd)(new aqf("", var8)));
         }

         var5.a("Players", (aqd)var6);
         var1.a((aqd)var5);
      }

      return var1;
   }

   protected void do(aqv var1) {
      aqv var2 = new aqv();
      boolean var3 = false;

      for(int var4 = 0; var4 < 3; ++var4) {
         np var5 = this.d.if(var4);
         if (var5 != null) {
            var2.a("slot_" + var4, var5.if());
            var3 = true;
         }
      }

      if (var3) {
         var1.a("DisplaySlots", var2);
      }

   }

   protected aqm byte() {
      aqm var1 = new aqm();
      Collection var2 = this.d.a();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         np var4 = (np)var3.next();
         aqv var5 = new aqv();
         var5.a("Name", var4.if());
         var5.a("CriteriaName", var4.a().a());
         var5.a("DisplayName", var4.for());
         var1.a((aqd)var5);
      }

      return var1;
   }

   protected aqm char() {
      aqm var1 = new aqm();
      Collection var2 = this.d.do();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         nn var4 = (nn)var3.next();
         aqv var5 = new aqv();
         var5.a("Name", var4.do());
         var5.a("Objective", var4.int().if());
         var5.a("Score", var4.for());
         var1.a((aqd)var5);
      }

      return var1;
   }
}

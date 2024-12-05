import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class alm extends net.minecraft.a.a implements amg {
   private final List uk = Collections.synchronizedList(new ArrayList());
   private final ajw uj;
   private akp ui;
   private akm uh;
   private ame ug;
   private boolean uf;
   private yz ue;
   private aku ud;
   private boolean ul = false;

   public alm(File var1) {
      super(var1);
      this.uj = new aj8("Minecraft-Server", (String)null, (new File(var1, "server.log")).getAbsolutePath());
      new all(this);
   }

   protected boolean gQ() {
      alk var1 = new alk(this);
      var1.setDaemon(true);
      var1.start();
      this.a().a("Starting minecraft server version 1.5.1");
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         this.a().if("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      this.a().a("Loading properties");
      this.ug = new ame(new File("server.properties"), this.a());
      if (this.hb()) {
         this.N("127.0.0.1");
      } else {
         this.N(this.ug.a("online-mode", true));
         this.N(this.ug.a("server-ip", ""));
      }

      this.M(this.ug.a("spawn-animals", true));
      this.T(this.ug.a("spawn-npcs", true));
      this.R(this.ug.a("pvp", true));
      this.P(this.ug.a("allow-flight", false));
      this.L(this.ug.a("texture-pack", ""));
      this.K(this.ug.a("motd", "A Minecraft Server"));
      if (this.ug.a("difficulty", 1) < 0) {
         this.ug.a("difficulty", (int)0);
      } else if (this.ug.a("difficulty", 1) > 3) {
         this.ug.a("difficulty", (int)3);
      }

      this.uf = this.ug.a("generate-structures", true);
      int var2 = this.ug.a("gamemode", yz.a.new());
      this.ue = y0.a(var2);
      this.a().a("Default game type: " + this.ue);
      InetAddress var3 = null;
      if (this.gY().length() > 0) {
         var3 = InetAddress.getByName(this.gY());
      }

      if (this.hc() < 0) {
         this.aR(this.ug.a("server-port", 25565));
      }

      this.a().a("Generating keypair");
      this.a(aj5.a());
      this.a().a("Starting Minecraft server on " + (this.gY().length() == 0 ? "*" : this.gY()) + ":" + this.hc());

      try {
         this.ud = new alh(this, var3, this.hc());
      } catch (IOException var16) {
         this.a().if("**** FAILED TO BIND TO PORT!");
         this.a().a("The exception was: {0}", var16.toString());
         this.a().if("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.hu()) {
         this.a().if("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         this.a().if("The server will make no attempt to authenticate usernames. Beware.");
         this.a().if("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
         this.a().if("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      this.a(new aln(this));
      long var4 = System.nanoTime();
      if (this.gT() == null) {
         this.Q(this.ug.a("level-name", "world"));
      }

      String var6 = this.ug.a("level-seed", "");
      String var7 = this.ug.a("level-type", "DEFAULT");
      String var8 = this.ug.a("generator-settings", "");
      long var9 = (new Random()).nextLong();
      if (var6.length() > 0) {
         try {
            long var11 = Long.parseLong(var6);
            if (var11 != 0L) {
               var9 = var11;
            }
         } catch (NumberFormatException var15) {
            var9 = (long)var6.hashCode();
         }
      }

      yx var17 = yx.a(var7);
      if (var17 == null) {
         var17 = yx.case;
      }

      this.aT(this.ug.a("max-build-height", 256));
      this.aT((this.hG() + 8) / 16 * 16);
      this.aT(ajs.a(this.hG(), 64, 256));
      this.ug.a("max-build-height", (Object)this.hG());
      this.a().a("Preparing level \"" + this.gT() + "\"");
      this.a(this.gT(), this.gT(), var9, var17, var8);
      long var12 = System.nanoTime() - var4;
      String var14 = String.format("%.3fs", (double)var12 / 1.0E9D);
      this.a().a("Done (" + var14 + ")! For help, type \"help\" or \"?\"");
      if (this.ug.a("enable-query", false)) {
         this.a().a("Starting GS4 status listener");
         this.ui = new akp(this);
         this.ui.do();
      }

      if (this.ug.a("enable-rcon", false)) {
         this.a().a("Starting remote control listener");
         this.uh = new akm(this);
         this.uh.do();
      }

      return true;
   }

   public boolean gX() {
      return this.uf;
   }

   public yz gK() {
      return this.ue;
   }

   public int g5() {
      return this.ug.a("difficulty", 1);
   }

   public boolean g0() {
      return this.ug.a("hardcore", false);
   }

   protected void a(aqh var1) {
      while(this.g8()) {
         this.hM();

         try {
            Thread.sleep(10L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

   }

   public aqh if(aqh var1) {
      var1 = super.if(var1);
      var1.for().a((String)"Is Modded", (Callable)(new alj(this)));
      var1.for().a((String)"Type", (Callable)(new ali(this)));
      return var1;
   }

   protected void he() {
      System.exit(0);
   }

   protected void hh() {
      super.hh();
      this.hM();
   }

   public boolean hj() {
      return this.ug.a("allow-nether", true);
   }

   public boolean hg() {
      return this.ug.a("spawn-monsters", true);
   }

   public void if(aja var1) {
      var1.a("whitelist_enabled", this.hL().do());
      var1.a("whitelist_count", this.hL().e().size());
      super.if(var1);
   }

   public boolean if() {
      return this.ug.a("snooper-enabled", true);
   }

   public void a(String var1, ar0 var2) {
      this.uk.add(new am4(var1, var2));
   }

   public void hM() {
      while(!this.uk.isEmpty()) {
         am4 var1 = (am4)this.uk.remove(0);
         this.gM().a(var1.a, var1.if);
      }

   }

   public boolean ht() {
      return true;
   }

   public aln hL() {
      return (aln)super.g6();
   }

   public aku ho() {
      return this.ud;
   }

   public int new(String var1, int var2) {
      return this.ug.a(var1, var2);
   }

   public String do(String var1, String var2) {
      return this.ug.a(var1, var2);
   }

   public boolean a(String var1, boolean var2) {
      return this.ug.a(var1, var2);
   }

   public void a(String var1, Object var2) {
      this.ug.a(var1, var2);
   }

   public void hJ() {
      this.ug.if();
   }

   public String hK() {
      File var1 = this.ug.a();
      return var1 != null ? var1.getAbsolutePath() : "No settings file";
   }

   public boolean gJ() {
      return this.ul;
   }

   public String a(yz var1, boolean var2) {
      return "";
   }

   public boolean hF() {
      return this.ug.a("enable-command-block", false);
   }

   public int gS() {
      return this.ug.a("spawn-protection", super.gS());
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5) {
      if (var1.n.if != 0) {
         return false;
      } else if (this.hL().case().isEmpty()) {
         return false;
      } else if (this.hL().for(var5.fJ)) {
         return false;
      } else if (this.gS() <= 0) {
         return false;
      } else {
         apg var6 = var1.long();
         int var7 = ajs.a(var2 - var6.if);
         int var8 = ajs.a(var4 - var6.do);
         int var9 = Math.max(var7, var8);
         return var9 <= this.gS();
      }
   }

   public ajw a() {
      return this.uj;
   }

   // $FF: synthetic method
   public amh g6() {
      return this.hL();
   }
}

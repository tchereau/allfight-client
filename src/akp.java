import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class akp extends akq {
   private long i;
   private int h;
   private int g;
   private int f;
   private String e;
   private String d;
   private DatagramSocket c = null;
   private byte[] b = new byte[1460];
   private DatagramPacket void = null;
   private Map long;
   private String goto;
   private String else;
   private Map m;
   private long l;
   private akt k;
   private long j;

   public akp(amg var1) {
      super(var1);
      this.h = var1.new("query.port", 0);
      this.else = var1.hl();
      this.g = var1.hr();
      this.e = var1.gL();
      this.f = var1.hz();
      this.d = var1.gT();
      this.j = 0L;
      this.goto = "0.0.0.0";
      if (0 != this.else.length() && !this.goto.equals(this.else)) {
         this.goto = this.else;
      } else {
         this.else = "0.0.0.0";

         try {
            InetAddress var2 = InetAddress.getLocalHost();
            this.goto = var2.getHostAddress();
         } catch (UnknownHostException var3) {
            this.if("Unable to determine local host IP, please set server-ip in '" + var1.hK() + "' : " + var3.getMessage());
         }
      }

      if (0 == this.h) {
         this.h = this.g;
         this.do("Setting default query port to " + this.h);
         var1.a("query.port", this.h);
         var1.a("debug", false);
         var1.hJ();
      }

      this.long = new HashMap();
      this.k = new akt(1460);
      this.m = new HashMap();
      this.l = (new Date()).getTime();
   }

   private void a(byte[] var1, DatagramPacket var2) {
      this.c.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private boolean for(DatagramPacket var1) {
      byte[] var2 = var1.getData();
      int var3 = var1.getLength();
      SocketAddress var4 = var1.getSocketAddress();
      this.for("Packet len " + var3 + " [" + var4 + "]");
      if (3 <= var3 && -2 == var2[0] && -3 == var2[1]) {
         this.for("Packet '" + aks.a(var2[2]) + "' [" + var4 + "]");
         switch(var2[2]) {
         case 0:
            if (!this.do(var1)) {
               this.for("Invalid challenge [" + var4 + "]");
               return false;
            } else if (15 == var3) {
               this.a(this.if(var1), var1);
               this.for("Rules [" + var4 + "]");
            } else {
               akt var5 = new akt(1460);
               var5.a((int)0);
               var5.a(this.a(var1.getSocketAddress()));
               var5.a(this.e);
               var5.a("SMP");
               var5.a(this.d);
               var5.a(Integer.toString(this.a()));
               var5.a(Integer.toString(this.f));
               var5.a((short)this.g);
               var5.a(this.goto);
               this.a(var5.if(), var1);
               this.for("Status [" + var4 + "]");
            }
         default:
            return true;
         case 9:
            this.a(var1);
            this.for("Challenge [" + var4 + "]");
            return true;
         }
      } else {
         this.for("Invalid packet [" + var4 + "]");
         return false;
      }
   }

   private byte[] if(DatagramPacket var1) {
      long var2 = System.currentTimeMillis();
      if (var2 < this.j + 5000L) {
         byte[] var7 = this.k.if();
         byte[] var8 = this.a(var1.getSocketAddress());
         var7[1] = var8[0];
         var7[2] = var8[1];
         var7[3] = var8[2];
         var7[4] = var8[3];
         return var7;
      } else {
         this.j = var2;
         this.k.a();
         this.k.a((int)0);
         this.k.a(this.a(var1.getSocketAddress()));
         this.k.a("splitnum");
         this.k.a((int)128);
         this.k.a((int)0);
         this.k.a("hostname");
         this.k.a(this.e);
         this.k.a("gametype");
         this.k.a("SMP");
         this.k.a("game_id");
         this.k.a("MINECRAFT");
         this.k.a("version");
         this.k.a(this.a.hq());
         this.k.a("plugins");
         this.k.a(this.a.hi());
         this.k.a("map");
         this.k.a(this.d);
         this.k.a("numplayers");
         this.k.a("" + this.a());
         this.k.a("maxplayers");
         this.k.a("" + this.f);
         this.k.a("hostport");
         this.k.a("" + this.g);
         this.k.a("hostip");
         this.k.a(this.goto);
         this.k.a((int)0);
         this.k.a((int)1);
         this.k.a("player_");
         this.k.a((int)0);
         String[] var4 = this.a.hs();
         byte var5 = (byte)var4.length;

         for(byte var6 = (byte)(var5 - 1); var6 >= 0; --var6) {
            this.k.a(var4[var6]);
         }

         this.k.a((int)0);
         return this.k.if();
      }
   }

   private byte[] a(SocketAddress var1) {
      return ((ako)this.m.get(var1)).if();
   }

   private Boolean do(DatagramPacket var1) {
      SocketAddress var2 = var1.getSocketAddress();
      if (!this.m.containsKey(var2)) {
         return false;
      } else {
         byte[] var3 = var1.getData();
         return ((ako)this.m.get(var2)).do() != aks.a(var3, 7, var1.getLength()) ? false : true;
      }
   }

   private void a(DatagramPacket var1) {
      ako var2 = new ako(this, var1);
      this.m.put(var1.getSocketAddress(), var2);
      this.a(var2.a(), var1);
   }

   private void try() {
      if (this.if) {
         long var1 = System.currentTimeMillis();
         if (var1 >= this.i + 30000L) {
            this.i = var1;
            Iterator var3 = this.m.entrySet().iterator();

            while(var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               if (((ako)var4.getValue()).a(var1)) {
                  var3.remove();
               }
            }

         }
      }
   }

   public void run() {
      this.do("Query running on " + this.else + ":" + this.h);
      this.i = System.currentTimeMillis();
      this.void = new DatagramPacket(this.b, this.b.length);

      try {
         while(this.if) {
            try {
               this.c.receive(this.void);
               this.try();
               this.for(this.void);
            } catch (SocketTimeoutException var7) {
               this.try();
            } catch (PortUnreachableException var8) {
            } catch (IOException var9) {
               this.a((Exception)var9);
            }
         }
      } finally {
         this.if();
      }

   }

   public void do() {
      if (!this.if) {
         if (0 < this.h && 65535 >= this.h) {
            if (this.byte()) {
               super.do();
            }

         } else {
            this.if("Invalid query port " + this.h + " found in '" + this.a.hK() + "' (queries disabled)");
         }
      }
   }

   private void a(Exception var1) {
      if (this.if) {
         this.if("Unexpected exception, buggy JRE? (" + var1.toString() + ")");
         if (!this.byte()) {
            this.a((String)"Failed to recover from buggy JRE, shutting down!");
            this.if = false;
         }

      }
   }

   private boolean byte() {
      try {
         this.c = new DatagramSocket(this.h, InetAddress.getByName(this.else));
         this.a((DatagramSocket)this.c);
         this.c.setSoTimeout(500);
         return true;
      } catch (SocketException var2) {
         this.if("Unable to initialise query system on " + this.else + ":" + this.h + " (Socket): " + var2.getMessage());
      } catch (UnknownHostException var3) {
         this.if("Unable to initialise query system on " + this.else + ":" + this.h + " (Unknown Host): " + var3.getMessage());
      } catch (Exception var4) {
         this.if("Unable to initialise query system on " + this.else + ":" + this.h + " (E): " + var4.getMessage());
      }

      return false;
   }
}

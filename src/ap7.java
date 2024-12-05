import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;

public class ap7 implements aqb {
   public static AtomicInteger y = new AtomicInteger();
   public static AtomicInteger x = new AtomicInteger();
   private final Object r;
   private final ajw q;
   private Socket p;
   private final SocketAddress o;
   private volatile DataInputStream n;
   private volatile DataOutputStream m;
   private volatile boolean l;
   private volatile boolean k;
   private List j;
   private List h;
   private List f;
   private an6 d;
   private boolean c;
   private Thread b;
   private Thread void;
   private String long;
   private Object[] goto;
   private int else;
   private int char;
   public static int[] w = new int[256];
   public static int[] v = new int[256];
   public int u;
   boolean t;
   boolean s;
   private SecretKey i;
   private PrivateKey g;
   private int e;

   public ap7(ajw var1, Socket var2, String var3, an6 var4) {
      this(var1, var2, var3, var4, (PrivateKey)null);
   }

   public ap7(ajw var1, Socket var2, String var3, an6 var4, PrivateKey var5) {
      this.r = new Object();
      this.l = true;
      this.k = false;
      this.j = Collections.synchronizedList(new ArrayList());
      this.h = Collections.synchronizedList(new ArrayList());
      this.f = Collections.synchronizedList(new ArrayList());
      this.c = false;
      this.long = "";
      this.else = 0;
      this.char = 0;
      this.u = 0;
      this.t = false;
      this.s = false;
      this.i = null;
      this.g = null;
      this.e = 50;
      this.g = var5;
      this.p = var2;
      this.q = var1;
      this.o = var2.getRemoteSocketAddress();
      this.d = var4;

      try {
         var2.setSoTimeout(30000);
         var2.setTrafficClass(24);
      } catch (SocketException var7) {
         System.err.println(var7.getMessage());
      }

      this.n = new DataInputStream(var2.getInputStream());
      this.m = new DataOutputStream(new BufferedOutputStream(var2.getOutputStream(), 5120));
      this.void = new ap5(this, var3 + " read thread");
      this.b = new ap3(this, var3 + " write thread");
      this.void.start();
      this.b.start();
   }

   public void a() {
      this.for();
      this.b = null;
      this.void = null;
   }

   public void a(an6 var1) {
      this.d = var1;
   }

   public void a(an7 var1) {
      if (!this.c) {
         synchronized(this.r) {
            this.char += var1.for() + 1;
            this.h.add(var1);
         }
      }
   }

   private boolean goto() {
      boolean var1 = false;

      try {
         int[] var10000;
         int var10001;
         an7 var2;
         if (this.u == 0 || !this.h.isEmpty() && System.currentTimeMillis() - ((an7)this.h.get(0)).int >= (long)this.u) {
            var2 = this.if(false);
            if (var2 != null) {
               an7.a(var2, this.m);
               if (var2 instanceof anh && !this.s) {
                  if (!this.d.a()) {
                     this.i = ((anh)var2).else();
                  }

                  this.else();
               }

               var10000 = v;
               var10001 = var2.do();
               var10000[var10001] += var2.for() + 1;
               var1 = true;
            }
         }

         if (this.e-- <= 0 && (this.u == 0 || !this.f.isEmpty() && System.currentTimeMillis() - ((an7)this.f.get(0)).int >= (long)this.u)) {
            var2 = this.if(true);
            if (var2 != null) {
               an7.a(var2, this.m);
               var10000 = v;
               var10001 = var2.do();
               var10000[var10001] += var2.for() + 1;
               this.e = 0;
               var1 = true;
            }
         }

         return var1;
      } catch (Exception var3) {
         if (!this.k) {
            this.a(var3);
         }

         return false;
      }
   }

   private an7 if(boolean var1) {
      an7 var2 = null;
      List var3 = var1 ? this.f : this.h;
      synchronized(this.r) {
         while(!var3.isEmpty() && var2 == null) {
            var2 = (an7)var3.remove(0);
            this.char -= var2.for() + 1;
            if (this.a(var2, var1)) {
               var2 = null;
            }
         }

         return var2;
      }
   }

   private boolean a(an7 var1, boolean var2) {
      if (!var1.if()) {
         return false;
      } else {
         List var3 = var2 ? this.f : this.h;
         Iterator var4 = var3.iterator();

         an7 var5;
         do {
            if (!var4.hasNext()) {
               return false;
            }

            var5 = (an7)var4.next();
         } while(var5.do() != var1.do());

         return var1.a(var5);
      }
   }

   public void for() {
      if (this.void != null) {
         this.void.interrupt();
      }

      if (this.b != null) {
         this.b.interrupt();
      }

   }

   private boolean void() {
      boolean var1 = false;

      try {
         an7 var2 = an7.a(this.q, this.n, this.d.a(), this.p);
         if (var2 != null) {
            if (var2 instanceof anh && !this.t) {
               if (this.d.a()) {
                  this.i = ((anh)var2).if(this.g);
               }

               this.char();
            }

            int[] var10000 = w;
            int var10001 = var2.do();
            var10000[var10001] += var2.for() + 1;
            if (!this.c) {
               if (var2.a() && this.d.if()) {
                  this.else = 0;
                  var2.a(this.d);
               } else {
                  this.j.add(var2);
               }
            }

            var1 = true;
         } else {
            this.a("disconnect.endOfStream");
         }

         return var1;
      } catch (Exception var3) {
         if (!this.k) {
            this.a(var3);
         }

         return false;
      }
   }

   private void a(Exception var1) {
      var1.printStackTrace();
      this.a("disconnect.genericReason", "Internal exception: " + var1.toString());
   }

   public void a(String var1, Object... var2) {
      if (this.l) {
         this.k = true;
         this.long = var1;
         this.goto = var2;
         this.l = false;
         (new ap1(this)).start();

         try {
            this.n.close();
         } catch (Throwable var6) {
         }

         try {
            this.m.close();
         } catch (Throwable var5) {
         }

         try {
            this.p.close();
         } catch (Throwable var4) {
         }

         this.n = null;
         this.m = null;
         this.p = null;
      }
   }

   public void if() {
      if (this.char > 2097152) {
         this.a("disconnect.overflow");
      }

      if (this.j.isEmpty()) {
         if (this.else++ == 1200) {
            this.a("disconnect.timeout");
         }
      } else {
         this.else = 0;
      }

      int var1 = 1000;

      while(!this.j.isEmpty() && var1-- >= 0) {
         an7 var2 = (an7)this.j.remove(0);
         var2.a(this.d);
      }

      this.for();
      if (this.k && this.j.isEmpty()) {
         this.d.a(this.long, this.goto);
      }

   }

   public SocketAddress do() {
      return this.o;
   }

   public void int() {
      if (!this.c) {
         this.for();
         this.c = true;
         this.void.interrupt();
         (new apz(this)).start();
      }
   }

   private void char() {
      this.t = true;
      InputStream var1 = this.p.getInputStream();
      this.n = new DataInputStream(aj5.a(this.i, var1));
   }

   private void else() {
      this.m.flush();
      this.s = true;
      BufferedOutputStream var1 = new BufferedOutputStream(aj5.a(this.i, this.p.getOutputStream()), 5120);
      this.m = new DataOutputStream(var1);
   }

   public int new() {
      return this.f.size();
   }

   public Socket long() {
      return this.p;
   }

   // $FF: synthetic method
   static boolean do(ap7 var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static boolean try(ap7 var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static boolean byte(ap7 var0) {
      return var0.void();
   }

   // $FF: synthetic method
   static boolean for(ap7 var0) {
      return var0.goto();
   }

   // $FF: synthetic method
   static DataOutputStream a(ap7 var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static boolean if(ap7 var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static void a(ap7 var0, Exception var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static Thread int(ap7 var0) {
      return var0.void;
   }

   // $FF: synthetic method
   static Thread new(ap7 var0) {
      return var0.b;
   }
}

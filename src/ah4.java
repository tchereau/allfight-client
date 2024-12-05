import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ah4 {
   private boolean if = true;
   private static final HashMap a = new HashMap();
   private final Map int = new HashMap();
   private boolean for;
   private ReadWriteLock do = new ReentrantReadWriteLock();

   public void a(int var1, Object var2) {
      Integer var3 = (Integer)a.get(var2.getClass());
      if (var3 == null) {
         throw new IllegalArgumentException("Unknown data type: " + var2.getClass());
      } else if (var1 > 31) {
         throw new IllegalArgumentException("Data value id is too big with " + var1 + "! (Max is " + 31 + ")");
      } else if (this.int.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id value for " + var1 + "!");
      } else {
         ah3 var4 = new ah3(var3, var1, var2);
         this.do.writeLock().lock();
         this.int.put(var1, var4);
         this.do.writeLock().unlock();
         this.if = false;
      }
   }

   public void a(int var1, int var2) {
      ah3 var3 = new ah3(var2, var1, (Object)null);
      this.do.writeLock().lock();
      this.int.put(var1, var3);
      this.do.writeLock().unlock();
      this.if = false;
   }

   public byte for(int var1) {
      return (Byte)this.if(var1).a();
   }

   public short try(int var1) {
      return (Short)this.if(var1).a();
   }

   public int int(int var1) {
      return (Integer)this.if(var1).a();
   }

   public String a(int var1) {
      return (String)this.if(var1).a();
   }

   public abp new(int var1) {
      return (abp)this.if(var1).a();
   }

   private ah3 if(int var1) {
      this.do.readLock().lock();

      ah3 var2;
      try {
         var2 = (ah3)this.int.get(var1);
      } catch (Throwable var6) {
         aqh var4 = aqh.a(var6, "Getting synched entity data");
         apu var5 = var4.a("Synched entity data");
         var5.a((String)"Data ID", (Object)var1);
         throw new ape(var4);
      }

      this.do.readLock().unlock();
      return var2;
   }

   public void if(int var1, Object var2) {
      ah3 var3 = this.if(var1);
      if (!var2.equals(var3.a())) {
         var3.a(var2);
         var3.a(true);
         this.for = true;
      }

   }

   public void do(int var1) {
      ah3.a(this.if(var1), true);
      this.for = true;
   }

   public boolean do() {
      return this.for;
   }

   public static void a(List var0, DataOutputStream var1) {
      if (var0 != null) {
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            ah3 var3 = (ah3)var2.next();
            a(var1, var3);
         }
      }

      var1.writeByte(127);
   }

   public List if() {
      ArrayList var1 = null;
      if (this.for) {
         this.do.readLock().lock();
         Iterator var2 = this.int.values().iterator();

         while(var2.hasNext()) {
            ah3 var3 = (ah3)var2.next();
            if (var3.do()) {
               var3.a(false);
               if (var1 == null) {
                  var1 = new ArrayList();
               }

               var1.add(var3);
            }
         }

         this.do.readLock().unlock();
      }

      this.for = false;
      return var1;
   }

   public void a(DataOutputStream var1) {
      this.do.readLock().lock();
      Iterator var2 = this.int.values().iterator();

      while(var2.hasNext()) {
         ah3 var3 = (ah3)var2.next();
         a(var1, var3);
      }

      this.do.readLock().unlock();
      var1.writeByte(127);
   }

   public List for() {
      ArrayList var1 = null;
      this.do.readLock().lock();

      ah3 var3;
      for(Iterator var2 = this.int.values().iterator(); var2.hasNext(); var1.add(var3)) {
         var3 = (ah3)var2.next();
         if (var1 == null) {
            var1 = new ArrayList();
         }
      }

      this.do.readLock().unlock();
      return var1;
   }

   private static void a(DataOutputStream var0, ah3 var1) {
      int var2 = (var1.if() << 5 | var1.for() & 31) & 255;
      var0.writeByte(var2);
      switch(var1.if()) {
      case 0:
         var0.writeByte((Byte)var1.a());
         break;
      case 1:
         var0.writeShort((Short)var1.a());
         break;
      case 2:
         var0.writeInt((Integer)var1.a());
         break;
      case 3:
         var0.writeFloat((Float)var1.a());
         break;
      case 4:
         an7.a((String)var1.a(), var0);
         break;
      case 5:
         abp var4 = (abp)var1.a();
         an7.a(var4, var0);
         break;
      case 6:
         apg var3 = (apg)var1.a();
         var0.writeInt(var3.if);
         var0.writeInt(var3.a);
         var0.writeInt(var3.do);
      }

   }

   public static List a(DataInputStream var0) {
      ArrayList var1 = null;

      for(byte var2 = var0.readByte(); var2 != 127; var2 = var0.readByte()) {
         if (var1 == null) {
            var1 = new ArrayList();
         }

         int var3 = (var2 & 224) >> 5;
         int var4 = var2 & 31;
         ah3 var5 = null;
         switch(var3) {
         case 0:
            var5 = new ah3(var3, var4, var0.readByte());
            break;
         case 1:
            var5 = new ah3(var3, var4, var0.readShort());
            break;
         case 2:
            var5 = new ah3(var3, var4, var0.readInt());
            break;
         case 3:
            var5 = new ah3(var3, var4, var0.readFloat());
            break;
         case 4:
            var5 = new ah3(var3, var4, an7.a((DataInputStream)var0, 64));
            break;
         case 5:
            var5 = new ah3(var3, var4, an7.do(var0));
            break;
         case 6:
            int var6 = var0.readInt();
            int var7 = var0.readInt();
            int var8 = var0.readInt();
            var5 = new ah3(var3, var4, new apg(var6, var7, var8));
         }

         var1.add(var5);
      }

      return var1;
   }

   public void a(List var1) {
      this.do.writeLock().lock();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ah3 var3 = (ah3)var2.next();
         ah3 var4 = (ah3)this.int.get(var3.for());
         if (var4 != null) {
            var4.a(var3.a());
         }
      }

      this.do.writeLock().unlock();
   }

   public boolean a() {
      return this.if;
   }

   static {
      a.put(Byte.class, 0);
      a.put(Short.class, 1);
      a.put(Integer.class, 2);
      a.put(Float.class, 3);
      a.put(String.class, 4);
      a.put(abp.class, 5);
      a.put(apg.class, 6);
   }
}

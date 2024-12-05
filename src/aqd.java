import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class aqd {
   public static final String[] a = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};
   private String if;

   abstract void a(DataOutput var1);

   abstract void if(DataInput var1);

   public abstract byte a();

   protected aqd(String var1) {
      if (var1 == null) {
         this.if = "";
      } else {
         this.if = var1;
      }

   }

   public aqd a(String var1) {
      if (var1 == null) {
         this.if = "";
      } else {
         this.if = var1;
      }

      return this;
   }

   public String if() {
      return this.if == null ? "" : this.if;
   }

   public static aqd a(DataInput var0) {
      byte var1 = var0.readByte();
      if (var1 == 0) {
         return new aqr();
      } else {
         String var2 = var0.readUTF();
         aqd var3 = a(var1, var2);

         try {
            var3.if(var0);
            return var3;
         } catch (IOException var7) {
            aqh var5 = aqh.a((Throwable)var7, (String)"Loading NBT data");
            apu var6 = var5.a("NBT Tag");
            var6.a((String)"Tag name", (Object)var2);
            var6.a((String)"Tag type", (Object)var1);
            throw new ape(var5);
         }
      }
   }

   public static void a(aqd var0, DataOutput var1) {
      var1.writeByte(var0.a());
      if (var0.a() != 0) {
         var1.writeUTF(var0.if());
         var0.a(var1);
      }
   }

   public static aqd a(byte var0, String var1) {
      switch(var0) {
      case 0:
         return new aqr();
      case 1:
         return new aqw(var1);
      case 2:
         return new aqi(var1);
      case 3:
         return new aqo(var1);
      case 4:
         return new aql(var1);
      case 5:
         return new aqq(var1);
      case 6:
         return new aqs(var1);
      case 7:
         return new aqx(var1);
      case 8:
         return new aqf(var1);
      case 9:
         return new aqm(var1);
      case 10:
         return new aqv(var1);
      case 11:
         return new aqp(var1);
      default:
         return null;
      }
   }

   public static String a(byte var0) {
      switch(var0) {
      case 0:
         return "TAG_End";
      case 1:
         return "TAG_Byte";
      case 2:
         return "TAG_Short";
      case 3:
         return "TAG_Int";
      case 4:
         return "TAG_Long";
      case 5:
         return "TAG_Float";
      case 6:
         return "TAG_Double";
      case 7:
         return "TAG_Byte_Array";
      case 8:
         return "TAG_String";
      case 9:
         return "TAG_List";
      case 10:
         return "TAG_Compound";
      case 11:
         return "TAG_Int_Array";
      default:
         return "UNKNOWN";
      }
   }

   public abstract aqd do();

   public boolean equals(Object var1) {
      if (!(var1 instanceof aqd)) {
         return false;
      } else {
         aqd var2 = (aqd)var1;
         if (this.a() != var2.a()) {
            return false;
         } else if (this.if == null && var2.if != null || this.if != null && var2.if == null) {
            return false;
         } else {
            return this.if == null || this.if.equals(var2.if);
         }
      }
   }

   public int hashCode() {
      return this.if.hashCode() ^ this.a();
   }
}

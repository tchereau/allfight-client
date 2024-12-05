public interface nb {
   ne d = new ne("1.3.6.1.4.1.22554");
   ne c = new ne(d.if() + ".1");
   ne b = new ne(c.if() + ".1");
   ne void = new ne(c.if() + ".2.1");
   ne long = new ne(c.if() + ".2.2");
   ne goto = new ne(c.if() + ".2.3");
   ne else = new ne(c.if() + ".2.4");
   ne char = new ne(b.if() + ".1");
   ne case = new ne(b.if() + ".2");
   ne byte = new ne(void.if() + ".1");
   ne try = new ne(void.if() + ".2");
   ne new = new ne(case.if() + ".1.2");
   ne int = new ne(case.if() + ".1.22");
   ne for = new ne(case.if() + ".1.42");
   ne do = new ne(try.if() + ".1.2");
   ne if = new ne(try.if() + ".1.22");
   ne a = new ne(try.if() + ".1.42");
}

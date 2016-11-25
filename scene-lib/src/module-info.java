module annotationtools.scenelib {
	exports type;
	exports annotations;
	exports annotations.el;
	exports annotations.io;
	exports annotations.io.classfile;
	exports annotations.util;
	exports annotations.util.coll;
	exports annotations.field;
	requires junit;
	requires plume;
	requires guava;
	requires annotationtools.asmx;
	//requires public jdk.jdeps;
	requires jdk.compiler;
	requires java.logging;
}
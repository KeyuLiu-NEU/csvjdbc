/* Generated By:JavaCC: Do not edit this line. ExpressionParserConstants.java */
package org.relique.jdbc.csv;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ExpressionParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NUMBER = 4;
  /** RegularExpression Id. */
  int DIGITS = 5;
  /** RegularExpression Id. */
  int NULL = 6;
  /** RegularExpression Id. */
  int AND = 7;
  /** RegularExpression Id. */
  int OR = 8;
  /** RegularExpression Id. */
  int NOT = 9;
  /** RegularExpression Id. */
  int IS = 10;
  /** RegularExpression Id. */
  int AS = 11;
  /** RegularExpression Id. */
  int LIKE = 12;
  /** RegularExpression Id. */
  int BETWEEN = 13;
  /** RegularExpression Id. */
  int NAME = 14;
  /** RegularExpression Id. */
  int STRING = 15;
  /** RegularExpression Id. */
  int RELOP = 16;
  /** RegularExpression Id. */
  int BINOP = 17;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<NUMBER>",
    "<DIGITS>",
    "\"NULL\"",
    "\"AND\"",
    "\"OR\"",
    "\"NOT\"",
    "\"IS\"",
    "\"AS\"",
    "\"LIKE\"",
    "\"BETWEEN\"",
    "<NAME>",
    "<STRING>",
    "<RELOP>",
    "<BINOP>",
    "\"(\"",
    "\")\"",
  };

}
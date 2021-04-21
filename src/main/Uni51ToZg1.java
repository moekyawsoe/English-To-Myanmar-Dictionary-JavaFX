//    Parabaik Myanmar Text Converter (Zawgyi <> Unicode)
//    Copyright (C) 2014 Ngwe TUN (Solveware Solution)

//    This program is free software; you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation; either version 2 of the License, or
//    (at your option) any later version.

//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.

//    You should have received a copy of the GNU General Public License along
//    with this program; if not, write to the Free Software Foundation, Inc.,
//    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
package main;

public class Uni51ToZg1
{
	public static String Uni_Z1(String input)
	{
		String output = input;


		output = output.replaceAll("\u104E\u1004\u103A\u1038", "\u104E");
		output = output.replaceAll("\u102B\u103A", "\u105A");
		output = output.replaceAll("\u102D\u1036", "\u108E");
		output = output.replaceAll("\u103F", "\u1086");


//   output = output.replaceAll("(\u102F[\u1036]?)\u1037", function($0, $1)
//   {
//      return $1 ? $1 + '\u1094' : $0 + $1;
//   }
//   );
//   output = output.replaceAll("(\u1030[\u1036]?)\u1037", function($0, $1)
//   {
//      return $1 ? $1 + '\u1094' : $0 + $1;
//   }
//   );
//   output = output.replaceAll("(\u1014[\u103A\u1032]?)\u1037", function($0, $1)
//   {
//      return $1 ? $1 + '\u1094' : $0 + $1;
//   }
//   );
//   output = output.replaceAll("(\u103B[\u1032\u1036]?)\u1037", function($0, $1)
//   {
//      return $1 ? $1 + '\u1095' : $0 + $1;
//   }
//   );
//
//   output = output.replaceAll("(\u103D[\u1032]?)\u1037",  function($0, $1)
//   {
//      return $1 ? $1 + '\u1095' : $0 + $1;
//   }
//   );
//
//   output = output.replaceAll("([\u103B\u103C\u103D][\u102D\u1036]?)\u102F", function($0, $1)
//   {
//      return $1 ? $1 + '\u1033' : $0 + $1;
//   }
//   );
//   output = output.replaceAll("((\u1039[\u1000-\u1021])[\u102D\u1036]?)\u102F",  function($0, $1)
//   {
//      return $1 ? $1 + '\u1033' : $0 + $1;
//   }
//   );
//   output = output.replaceAll("([\u100A\u100C\u1020\u1025\u1029][\u102D\u1036]?)\u102F", function($0, $1)
//   {
//      return $1 ? $1 + '\u1033' : $0 + $1;
//   }
//   );
//   output = output.replaceAll("([\u103B\u103C][\u103D]?[\u103E]?[\u102D\u1036]?)\u1030", function($0, $1)
//   {
//      return $1 ? $1 + '\u1034' : $0 + $1;
//
//   }
//   );
//   // uu - 2
//   output = output.replaceAll("((\u1039[\u1000-\u1021])[\u102D\u1036]?)\u1030", function($0, $1)
//   {
//      return $1 ? $1 + '\u1034' : $0 + $1;
//
//   }
//   );
//   // uu - 2
//   output = output.replaceAll("([\u100A\u100C\u1020\u1025\u1029][\u102D\u1036]?)\u1030", function($0, $1)
//   {
//      return $1 ? $1 + '\u1034' : $0 + $1;
//
//   }
//   );
//   // uu - 2
//
//   output = output.replaceAll("(\u103C)\u103E", function($0, $1)
//   {
//      return $1 ? $1 + '\u1087' : $0 + $1;
//
//   }
//   );
		// ha - 2


		output = output.replaceAll("\u1009(?=[\u103A])", "\u1025");
		output = output.replaceAll("\u1009(?=\u1039[\u1000-\u1021])", "\u1025");



		// E render
		output = output.replaceAll("([\u1000-\u1021\u1029])((?:\u1039[\u1000-\u1021])?)((?:[\u103B-\u103E\u1087]*)?)\u1031", "\u1031$1$2$3");

		// Ra render

		output = output.replaceAll("([\u1000-\u1021\u1029])((?:\u1039[\u1000-\u1021\u1000-\u1021])?)(\u103C)", "$3$1$2");



		// Kinzi
		output = output.replaceAll("\u1004\u103A\u1039", "\u1064");
		// kinzi
		output = output.replaceAll("(\u1064)([\u1031]?)([\u103C]?)([\u1000-\u1021])\u102D", "$2$3$4\u108B");
		// reordering kinzi lgt
		output = output.replaceAll("(\u1064)(\u1031)?(\u103C)?([ \u1000-\u1021])\u102E", "$2$3$4\u108C");
		// reordering kinzi lgtsk
		output = output.replaceAll("(\u1064)(\u1031)?(\u103C)?([ \u1000-\u1021])\u1036", "$2$3$4\u108D");
		// reordering kinzi ttt
		output = output.replaceAll("(\u1064)(\u1031)?(\u103C)?([ \u1000-\u1021])", "$2$3$4\u1064");
		// reordering kinzi

		// Consonant

		output = output.replaceAll("\u100A(?=[\u1039\u102F\u1030])", "\u106B");
		// nnya - 2
		output = output.replaceAll("\u100A", "\u100A");
		// nnya

		output = output.replaceAll("\u101B(?=[\u102F\u1030])", "\u1090");
		// ra - 2
		output = output.replaceAll("\u101B", "\u101B");
		// ra

		output = output.replaceAll("\u1014(?=[\u1039\u103D\u103E\u102F\u1030])", "\u108F");
		// na - 2
		output = output.replaceAll("\u1014", "\u1014");
		// na

		// Stacked consonants
		output = output.replaceAll("\u1039\u1000", "\u1060");
		output = output.replaceAll("\u1039\u1001", "\u1061");
		output = output.replaceAll("\u1039\u1002", "\u1062");
		output = output.replaceAll("\u1039\u1003", "\u1063");
		output = output.replaceAll("\u1039\u1005", "\u1065");
		output = output.replaceAll("\u1039\u1006", "\u1066");
		// 1067
//   output = output.replaceAll("([\u1001\u1002\u1004\u1005\u1007\u1012\u1013\u108F\u1015\u1016\u1017\u1019\u101D])\u1066", function($0, $1)
//   {
//      return $1 ? $1 + '\u1067' : $0 + $1;
//
//   }
//   );
		// 1067
		output = output.replaceAll("\u1039\u1007", "\u1068");
		output = output.replaceAll("\u1039\u1008", "\u1069");

		output = output.replaceAll("\u1039\u100F", "\u1070");
		output = output.replaceAll("\u1039\u1010", "\u1071");
//   // 1072 omit (little shift to right)
//   output = output.replaceAll("([\u1001\u1002\u1004\u1005\u1007\u1012\u1013\u108F\u1015\u1016\u1017\u1019\u101D])\u1071", function($0, $1)
//   {
//      return $1 ? $1 + '\u1072' : $0 + $1;
//
//   }
//   );
		// 1067
		output = output.replaceAll("\u1039\u1011", "\u1073");
//   // \u1074 omit(little shift to right)
//   output = output.replaceAll("([\u1001\u1002\u1004\u1005\u1007\u1012\u1013\u108F\u1015\u1016\u1017\u1019\u101D])\u1073", function($0, $1)
//   {
//      return $1 ? $1 + '\u1074' : $0 + $1;
//
//   }
//   );
		// 1067
		output = output.replaceAll("\u1039\u1012", "\u1075");
		output = output.replaceAll("\u1039\u1013", "\u1076");
		output = output.replaceAll("\u1039\u1014", "\u1077");
		output = output.replaceAll("\u1039\u1015", "\u1078");
		output = output.replaceAll("\u1039\u1016", "\u1079");
		output = output.replaceAll("\u1039\u1017", "\u107A");
		output = output.replaceAll("\u1039\u1018", "\u107B");
		output = output.replaceAll("\u1039\u1019", "\u107C");
		output = output.replaceAll("\u1039\u101C", "\u1085");


		output = output.replaceAll("\u100F\u1039\u100D", "\u1091");
		output = output.replaceAll("\u100B\u1039\u100C", "\u1092");
		output = output.replaceAll("\u1039\u100C", "\u106D");
		output = output.replaceAll("\u100B\u1039\u100B", "\u1097");
		output = output.replaceAll("\u1039\u100B", "\u106C");
		output = output.replaceAll("\u100E\u1039\u100D", "\u106F");
		output = output.replaceAll("\u100D\u1039\u100D", "\u106E");

		output = output.replaceAll("\u1009(?=\u103A)", "\u1025");
		// u
		output = output.replaceAll("\u1025(?=[\u1039\u102F\u1030])", "\u106A");
		// u - 2
		output = output.replaceAll("\u1025", "\u1025");
		// u
		/////////////////////////////////////

		output = output.replaceAll("\u103A", "\u1039");
		// asat

		output = output.replaceAll("\u103B\u103D\u103E", "\u107D\u108A");
		// ya wa ha
		output = output.replaceAll("\u103D\u103E", "\u108A");
		// wa ha

		output = output.replaceAll("\u103B", "\u103A");
		// ya
		output = output.replaceAll("\u103C", "\u103B");
		// ra
		output = output.replaceAll("\u103D", "\u103C");
		// wa
		output = output.replaceAll("\u103E", "\u103D");
		// ha
		output = output.replaceAll("\u103A(?=[\u103C\u103D\u108A])", "\u107D");
		// ya - 2

//   output = output.replaceAll("(\u100A(?:[\u102D\u102E\u1036\u108B\u108C\u108D\u108E])?)\u103D", function($0, $1)
//   {
//      //      return $1 ? $1 + '\u1087 ' : $0 + $1;
//      return $1 ? $1 + '\u1087' : $0 ;
//
//   }
//   );
		// ha - 2

		output = output.replaceAll("\u103B(?=[\u1000\u1003\u1006\u100F\u1010\u1011\u1018\u101A\u101C\u101E\u101F\u1021])", "\u107E");
		// great Ra with wide consonants
		output = output.replaceAll("\u107E([\u1000-\u1021\u108F])(?=[\u102D\u102E\u1036\u108B\u108C\u108D\u108E])", "\u1080$1");
		// great Ra with upper sign
		output = output.replaceAll("\u107E([\u1000-\u1021\u108F])(?=[\u103C\u108A])", "\u1082$1");
		// great Ra with under signs

		output = output.replaceAll("\u103B([\u1000-\u1021\u108F])(?=[\u102D \u102E \u1036 \u108B \u108C \u108D \u108E])", "\u107F$1");
		// little Ra with upper sign

		output = output.replaceAll("\u103B([\u1000-\u1021\u108F])(?=[\u103C\u108A])", "\u1081$1");
		// little Ra with under signs

//   output = output.replaceAll("(\u1014[\u103A\u1032]?)\u1037", function($0, $1)
//   {
//      return $1 ? $1 + '\u1094' : $0 + $1;
//
//   }
//   );
//   // aukmyint
//   output = output.replaceAll("(\u1033[\u1036]?)\u1094", function($0, $1)
//   {
//      return $1 ? $1 + '\u1095' : $0 + $1;
//
//   }
//   );
//   // aukmyint
//   output = output.replaceAll("(\u1034[\u1036]?)\u1094", function($0, $1)
//   {
//      return $1 ? $1 + '\u1095' : $0 + $1;
//
//   }
//   );
//   // aukmyint
//   output = output.replaceAll("([\u103C\u103D\u108A][\u1032]?)\u1037", function($0, $1)
//   {
//      return $1 ? $1 + '\u1095' : $0 + $1;
//
//   }
//   );
		// aukmyint
		return output;

	}
// Uni_Z1
}
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

public class Zg1ToUni51 {
    public static String Z1_Uni(String input) {
        String output = input;

        String tallAA = "\u102B";
        String AA = "\u102C";
        String vi = "\u102D";
        // lone gyi tin
        String ii = "\u102E";
        String u = "\u102F";
        String uu = "\u1030";
        String ve = "\u1031";
        String ai = "\u1032";
        String ans = "\u1036";
        String db = "\u1037";
        String visarga = "\u1038";

        String asat = "\u103A";

        String ya = "\u103B";
        String ra = "\u103C";
        String wa = "\u103D";
        String ha = "\u103E";
        String zero = "\u1040";


        // remove BOMs
        output = output.replaceAll("\ufeff", "");

        output = output.replaceAll("\u106A", " \u1009");
        output = output.replaceAll("\u1025(?=[\u1039\u102C])", "\u1009"); //new
        output = output.replaceAll("\u1025\u102E", "\u1026"); //new
        output = output.replaceAll("\u106B", "\u100A");
        output = output.replaceAll("\u1090", "\u101B");
        output = output.replaceAll("\u1040", zero);

        output = output.replaceAll("\u108F", "\u1014");
        output = output.replaceAll("\u1012", "\u1012");
        output = output.replaceAll("\u1013", "\u1013");
        /////////////


        output = output.replaceAll("[\u103D\u1087]", ha);
        // ha
        output = output.replaceAll("\u103C", wa);
        // wa
        output = output.replaceAll("[\u103B\u107E\u107F\u1080\u1081\u1082\u1083\u1084]", ra);
        // ya yint(ra)
        output = output.replaceAll("[\u103A\u107D]", ya);
        // ya

        output = output.replaceAll("\u103E\u103B", ya + ha);
        // reorder

        output = output.replaceAll("\u108A", wa + ha);
        output = output.replaceAll("\u103E\u103D", wa + ha);
        // wa ha

        ////////////////////// Reordering
        output = output.replaceAll("(\u1031?)(\u103C?)([\u1000-\u1021])\u1064", "\u1064$1$2$3");
        // reordering kinzi
        output = output.replaceAll("(\u1031?)(\u103C?)([\u1000-\u1021])\u108B", "\u1064$1$2$3\u102D");
        // reordering kinzi lgt
        output = output.replaceAll("(\u1031?)(\u103C?)([\u1000-\u1021])\u108C", "\u1064$1$2$3\u102E");
        // reordering kinzi lgtsk
        output = output.replaceAll("(\u1031?)(\u103C?)([\u1000-\u1021])\u108D", "\u1064$1$2$3\u1036");
        // reordering kinzi ttt

        ////////////////////////////////////////
        output = output.replaceAll("\u105A", tallAA + asat);
        output = output.replaceAll("\u108E", vi + ans);
        // lgt ttt
        output = output.replaceAll("\u1033", u);
        output = output.replaceAll("\u1034", uu);
        output = output.replaceAll("\u1088", ha + u);
        // ha  u
        output = output.replaceAll("\u1089", ha + uu);
        // ha  uu

        ///////////////////////////////////////

        output = output.replaceAll("\u1039", "\u103A");
        output = output.replaceAll("[\u1094\u1095]", db);
        // aukmyint

        ///////////////////////////////////////Pasint order human error
        output = output.replaceAll("([\u1000-\u1021])([\u102C\u102D\u102E\u1032\u1036]){1,2}([\u1060\u1061\u1062\u1063\u1065\u1066\u1067\u1068\u1069\u1070\u1071\u1072\u1073\u1074\u1075\u1076\u1077\u1078\u1079\u107A\u107B\u107C\u1085])", "$1$3$2");  //new

        /////////////

        output = output.replaceAll("\u1064", "\u1004\u103A\u1039");

        output = output.replaceAll("\u104E", "\u104E\u1004\u103A\u1038");

        output = output.replaceAll("\u1086", "\u103F");

        output = output.replaceAll("\u1060", "\u1039\u1000");
        output = output.replaceAll("\u1061", "\u1039\u1001");
        output = output.replaceAll("\u1062", "\u1039\u1002");
        output = output.replaceAll("\u1063", "\u1039\u1003");
        output = output.replaceAll("\u1065", "\u1039\u1005");
        output = output.replaceAll("[\u1066\u1067]", "\u1039\u1006");
        output = output.replaceAll("\u1068", "\u1039\u1007");
        output = output.replaceAll("\u1069", "\u1039\u1008");
        output = output.replaceAll("\u106C", "\u1039\u100B");
        output = output.replaceAll("\u1070", "\u1039\u100F");
        output = output.replaceAll("[\u1071\u1072]", "\u1039\u1010");
        output = output.replaceAll("[\u1073\u1074]", "\u1039\u1011");
        output = output.replaceAll("\u1075", "\u1039\u1012");
        output = output.replaceAll("\u1076", "\u1039\u1013");
        output = output.replaceAll("\u1077", "\u1039\u1014");
        output = output.replaceAll("\u1078", "\u1039\u1015");
        output = output.replaceAll("\u1079", "\u1039\u1016");
        output = output.replaceAll("\u107A", "\u1039\u1017");
        output = output.replaceAll("\u107B", "\u1039\u1018");
        output = output.replaceAll("\u107C", "\u1039\u1019");
        output = output.replaceAll("\u1085", "\u1039\u101C");
        output = output.replaceAll("\u106D", "\u1039\u100C");

        output = output.replaceAll("\u1091", "\u100F\u1039\u100D");
        output = output.replaceAll("\u1092", "\u100B\u1039\u100C");
        output = output.replaceAll("\u1097", "\u100B\u1039\u100B");
        output = output.replaceAll("\u106F", "\u100E\u1039\u100D");
        output = output.replaceAll("\u106E", "\u100D\u1039\u100D");

        /////////////////////////////////////////////////////////

        output = output.replaceAll("(\u103C)([\u1000-\u1021])((?:\u1039[\u1000-\u1021])?)", "$2$3$1");
        // reordering ra
        //output =  output.replaceAll( /(\u103E)?(\u103D)?([\u103B\u103C])/g, "$3$2$1");
        // reordering ra

        output = output.replaceAll("(\u103E)(\u103D)([\u103B\u103C])", "$3$2$1");
        output = output.replaceAll("(\u103E)([\u103B\u103C])", "$2$1");

        output = output.replaceAll("(\u103D)([\u103B\u103C])", "$2$1");

        output = output.replaceAll("(([\u1000-\u101C\u101E-\u102A\u102C\u102E-\u103F\u104C-\u109F]))(\u1040)", "$1\u101D");
        // zero and wa


        output = output.replaceAll("((\u101D))(\u1040)", "$1\u101D");
        // zero and wa

        output = output.replaceAll("(([\u1000-\u101C\u101E-\u102A\u102C\u102E-\u103F\u104C-\u109F\u0020]))(\u1047)", "$1\u101B");
        // seven and ra

        output = output.replaceAll("(\u1047)( ? = [\u1000 - \u101C\u101E - \u102A\u102C\u102E - \u103F\u104C - \u109F\u0020])", "\u101B");
        // seven and ra

		/* output =  output.replaceAll( /(\u1031)?([\u1000-\u1021])(\u1039[\u1000-\u1021])?([\u102D\u102E\u1032])?([\u1036\u1037\u1038]{0,2})([\u103B-\u103E]{0,3})([\u102F\u1030])?([\u102D\u102E\u1032])?/g, "$2$3$6$1$4$8$7$5");
		 // reordering storage order*/
        output = output.replaceAll("(\u1031?)([\u1000-\u1021])((?:\u1039[\u1000-\u1021])?)([\u102D\u102E\u1032]?)([\u1036\u1037\u1038]{0,2})([\u103B-\u103E]{0,3})([\u102F\u1030]?)([\u1036\u1037\u1038]{0,2})([\u102D\u102E\u1032]?)", "$2$3$6$1$4$9$7$5$8");
        // reordering storage order
        output = output.replaceAll(ans + u, u + ans);

        output = output.replaceAll("(\u103A)(\u1037)", "$2$1");
        // For Latest Myanmar3


        return output;

    }//Z1_Uni
}
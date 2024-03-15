package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        StdOut.println(prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
        StdOut.println(prefixCount(new String[]{"leetcode","win","loops","success"}, "code"));
        StdOut.println(prefixCount(new String[]{"oub","rrjxxacsstfpccffprybnxvpmkssexgfhaxknuyzdfrpzsoyohkmggaukhpnyzmqjbzkqkctlrbnzrfxmfinf","rrrndppiqofqacmkozxdlssekuaajpmtydjlw","ddtvuojkktdfhcfmktkpkuhryoeyrhkewqgskkirixccqjymkxvfbkwafrrobtmslfsegzbzt","oirlqqlfydoucxytmksafgbuyjqs","rrxpajoyi","ddwntyyrmmrmkdokfqlowklzcnemrybxukwzbmeuchfoaiibrujgazlfdj","rarpptobyjqgjdrwxphggtilqhypnlvpwhixda","rrpfqbeyba","brxjhidpqsthlaatrpydqfprozesyxqkdfjrmqe","xzvlcbgmxephipjtgtfzxdhqacpztojejhofexubwtxjwjcjsfqgklpgzuyzmxqfjkgzwdvk","gjzcarsxfpdaeicyhwumogbogwnkrkerocpuasrjnlvhuavnshkajyotqypxjoyghljjfrlcnifikymjhueexzciykfltvmh","h","pxkhkbxfspqbxfrrkbjiygbkdhxasunvtxytfpktgoeqtwvwfbqnpidabmbpsdceflgihohvjfclbxda","xqumplvhsayxpzghfmktmzmbdowelhkxlydjgxrtctsxglggklpchmfxkjxwlwwzkpqbyt","uofvaqzhaecwtyponqkvpolpncorpwwl","rriomxjoasrhtseqhcobzvmohxoucmfaozzmdzqiscjackvtcekdfsoucfkzicmibjwpvfunc","jfqqwiozdpjinfpzpmhhjhqvb","kmdwejqmxmckucwscrcnjxmctjvxvgksjssgwghbmqurzxarlds","cjwweeqmwjtbysduttahhrsgwdbwbcfnqkxaaczqigkwqhklzefevrasifkrq","fnbsqafjrbobjppevxjdfzwblqichhiynjlwsacllclmsncehflbzruwptiksrrhoxiggwx","igkezqdshykrkqdllltuzojjdmedrjwwdgxarjlitjzjrcnplgymudgjmuxdxdgnewwuizvleuuspuvyrufmb","auqpjfvdultntwgrpjiaigdxrigciglwkefbkodbnbffwitneskwpdiodajleo","fllczlseyhztxonifnbfzdihrxqflxhlyice","rrciegtghegenmdsrhbgrnuzamwumpzmvmdtnbrythdrwsrgmegnlpxwlqkzjdwerw","tqlwcmxvuyvrzsfrdfzuyuqqfotekcbxlhqrpcqrdwmitctrusbj","boqgvvdhcgicybijuoynekfnqhirlepioumzauckvgkjvomtmaio","bporansjqnoakgioyfigcpsmsuudiftcmhziwahssdddioi","cdhsvaykxlbmvlnmqtuczxaslvyprjqzyvxxsjbpl","sq","hryymsczwmifyjcmjuffmtadujjphrtwcpvewttifcozdmwalajzjpl","wjzwzzjudvpxdrinflsctgqwbmqevylnutqocaxxuixnbyxdyynrxeieqkkrehbu","qjargkftlfffclyufpuccftlwdufwvlkrtzfbskkcoarhjjwwynuxfmrrwylztheonzqugzord","dgsmitxcillfumdrtozlbbwkbtxskvmlnudxqijxqwofbdqfg","enzojjdyeuszzhpbdta","cygawbbmrgmmtrlhe","evpcnb","vdziajiwijftmxlkssakzs","horvhouechdwjsgbctwbhfgeczyiunzuwrzlmdnwxzlyycxighohqgfrtazisvlm","rrqyldfbhzjqauhlxvbkehirgnpjurvabucqsjtphsyawlkkdfh","bmtxdwmwt","rvcrsrjdukwbcyosnhvnam","rrsrtyhjaakuudvmyofnwgcuaxhmifixkzemopvbikqjzyipgurmjssewjyevomp","oylvoiwzyfhehtyxnetjxmrzksxpzxbwmpukblcjqqwyhxhmndgbxaarnscvvmfy","rrqafzp","ltldjxucbidjlaaweudlkwtvtspxpvakjqmgwaspugxbssecuqtyebvabfapvsnfaulfrgussqirclgjxzbyg","lauhhwzwqausfvm","wmyjhecfdazrpotqfjxlfdimeqddbkrlhkkwhrkjqmjytgrxwsibztteuoqbbqldkk","rrnvvntovbahvtitsrfllbuqjhmblgseqxn","f","zccdzdnwsejylkndwpwnyaevzbxlyacxvhrddhcraegkwvauzhnpadgnrmjsotmagrrwfn","cvsazvqcazlxumnqfpstupfacuyzusobvbaldiluwnwfbbagprrq","rrytquf","lcjibeouquxudfzttfkysbttqjrguljwjqliok","nxvvhisqgnxjnwivktmvvfdgdvokrszlpowpruhcsoklmtljbhrpobpqgmalujew","rrrfmdxuaktqudjdiagdcilwtpkihyvqrcrheuhrfvflydwyloo","rrnj","fohqorjevrumfsdmqmamksifuozzdeagjsapxilcwxhfqxomxaqswsvpyavvacyezpvckcyqajarongtolmlsjuapcra","rlutjuobxxpbqqei","puuljbgtmoybrkgo","ud","fq","lrhauhhgaqrguotyrglghymtkchtsq","nrdxkhitfdwdnscalhjienjtkhhgnpievadfowlufmq","eiacimxegnw","oqsezvgluojxplsnqupfwp","oltulwbiqhzdqpwiznalmtsjejuacnbcwfuzllpvmrywyfailpurdhhltryqanosoeizmlzqifvuzn","ntzrttbsxqvqcyskslbmaipgu","rrhsmeudtsqfthzewvqwdzzwinnyzawzqzhqrgzuluylzqfzgbmtsntrdntdq","uijefbhzqpjoxtalvajzlvhvqyjbntmsfqwrxdofjtdeueilertmndewkjtrckoavbxbmerqomeshmhlstbfxxyfhdfmuim","trdgwdtredlqknfhjsptjnducbnqvexpsggsoyzmtnbvskdg","rrkjtimutbipmywedsjypreojmapfishusnqatvdxotcp","remkvhxnjlwfpbffhkprscpcjzysclsgkdyjczftgpsnouqupwytjpwrrqdyztkwxzxaicwqkrmziyrzpstctbmchqxr","obeprwdggrcaxdnjxduyub","gb","pymvzbtrsdemkgieexpspjawqurgryovkwzlkmxieqeyayzoqtnuymequmuhezs","mljwawotlombcnnrhqzmhopzdihwoffligzhgzjvnyyhiknjxenhmybqqxztrqkbsuhduxovehtromrdwo","sprvuironbfhxxupprpxnhkosefvmqjnitmeemsucayxiiuibgrhbskivncdmoaeroavgevccabq","rrjdsnkrmhekdl","vwizphfkvexzyccuwbifgyymopzivb","vxzperdrldh","vstfeimpakrujoqliwrszwmrzfyodmnekaakvuitppifzsrgelacgfontzozzsshkngdlipjksxmgumyblbbhkqj","oekuyywvojkvpxijgpzrhstfaat","qkzqubsmitlpydfnzbnapvkblacdtehvpfkeitkamhhcgxtjcrm","uargexkdiaauyteiokuhmoaowkexeakutfikicgsieojnhbboxbahkpyyguraiklvtd","ybvkxohogztqivvxppwswewixwuosxmgcfjrxfyias","ifraoutthwyrbhyecxmivxnzku","rrkekeoeyovksnpwnprvdqbmcexdqdubquedbwvqqdlmhyybhq","apejiixlvdgagh","anzktmvearllyviotkvfvbyqgcuptbnf","cumehawcuixhavitrjsjdeon","jtmbuoozakfwcbeyvddfegiskacrsencnmlowjnrhbvklydbgplv","rrnkiqmotaohieyomxhwopllqltuepjymudruhzsirhndvxrzwwcntbudqahougikllviiumatvnopqjrufnwdklq","phwezoocakorvkevbhcicsfwnliprbshdudbyanjiqiy","ezrjymxzpddeoczeiehparadajbxaihqujcberquhyjvzbzhxodynpxlkenoyxejndyuacybxrfkgsgkxjinywrpkk","dvqetqpvjiizcsidkwpjcfqgttmzewzhiplqxqvxnxdnyjuxbabniagrcrcwzuenzxnbhnkhtzjoxbolkupahehqvddnzgubeo","gmlzvqdcyewirndbtitgczptapgpvvtqskfboexkxhnnxjpbjxzbiowkqtztlvuqqdrhittfdcghyxjg","vdyymztrbdfqgomvcztzpsuxwuuiujahfmatlookusicsgnlguhctdeh"}, "rr"));
        StdOut.println(prefixCount(new String[]{"udt","ipbjt","itjbniqf","iwcsd","iv","ezljsxgrv","ixkxv","iwcyrwi","ig","iwrkov","izm","imuusv","iphigkdxxs","g","ildeyvbz","ibywdj","ifctnctguw","ipqnn","td","iscvdjx","ebsy","cl","ik","ik","ionapx","ikhbyzyjq","iuib","ijobcngoob","io","iyvcuronb","ivopadcf","iw","isd","iiv","xzxsfcgz","ikusrhkqc","sywa","iw","my","ivojahjdl","imxyhpttr","ivpdleigq","is","iyxmbyssga","igvjeuxnmf","ircdd","irz","iwjlvbrunc","yefbv","ipcs","wxvhccv","ihythcmyj","iwgvdonax","irxozbyu","vwtees","ithdg","izhlb","kb","ieejxccn","byaf","ixip","cao","ipajauzv","iqxns","iqpjkrpy","iu","puehsn","iqxcavuat","ycqewlca","iaj"}, "i"));
    }

    /**
     * You are given an array of strings 'words' and a string 'pref'.
     * <br>
     * Return the number of strings in 'words' that contain 'pref' as a prefix.
     * <br>
     * A prefix of a string 's' is any leading contiguous substring of 's'.
     * <br>
     * <br>
     * Complexity of <b>O(N * K)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param words array of Strings.
     * @param pref a String to be counted.
     * @return number o strings in 'words' that contain 'pref'
     */
    public static int prefixCount(String[] words, String pref) {
        int counter = 0;
        String s;
        for (String word : words) {
            s = word;
            if (s.startsWith(pref)) counter++; //Proportional to the length of prefix 'pref', thus 'K'.
        }
        return counter;
    }
}

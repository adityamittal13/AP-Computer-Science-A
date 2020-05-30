2) a)

public String decodeString(ArrayList<StringPart> parts){
    String str = "";
    for (StringPart part: parts){
        str += masterString.substring(part.getStart(), part.getStart()+part.getLength());
    }
    return str;
}

b)
public ArrayList<StringPart> encodeString(String word){
    ArrayList<StringPart> list = new ArrayList<StringPart>();
    for (int i = 0; i < word.length(); i++){
        list.add(this.findPart(word.substring(i, i+1));
    }
    return list;
}


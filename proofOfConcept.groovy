def preprocess(String template){
    String pattern ="\\{\\{[\\W]*message[\\W]+\"(.+)\"[\\W]*\\}\\}"
    def messageTag = Pattern.compile(pattern)
    messageMatcher = messageTag.matcher(template);
	String result;
    while(messageMatcher.find()){
        println "Message: ${messageMatcher.group()}, count: ${messageMatcher.groupCount()}"
        String translation =  translate(messageMatcher.group(1))
        result = messageMatcher.replaceFirst(translation);
        messageMatcher.reset(result)
    }

    return result;
}

def String translate(String marker){
    return "-->$marker<--"
}

println preprocess(template)

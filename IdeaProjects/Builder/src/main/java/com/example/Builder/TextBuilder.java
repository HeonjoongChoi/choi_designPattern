package com.example.Builder;

//일반 텍스트(보통의 문자열)를 이용해서 문서를 만드는 클래
public class TextBuilder extends Builder{
    private  StringBuffer buffer = new StringBuffer(); // 필드의 문서를 구축한다.
    public void makeTitle(String title) {              // 일반 텍스트의 제목
        buffer.append("======================================\n"); //장식선
        buffer.append("<" + title + ">\n");
        buffer.append("\n");
    }
    public void makeString(String str) {
        buffer.append('-' + str + "\n");
        buffer.append("\n");
    }
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" >" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    public void close() {
        buffer.append("======================================\n");
    }
    public String getResult() {
        return buffer.toString();
    }

}

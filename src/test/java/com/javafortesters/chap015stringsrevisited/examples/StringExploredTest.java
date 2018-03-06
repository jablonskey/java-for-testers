package com.javafortesters.chap015stringsrevisited.examples;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class StringExploredTest {
  @Test
  public void checkStringOptions() {
    System.out.println("That's a backspace: \b\b\b\b\b\ba");
  }

  @Test
  public void canConvertWBytesUTF8() throws UnsupportedEncodingException {
    byte[] b8Array = "hello there".getBytes("UTF-8");
    System.out.println(Arrays.toString(b8Array));
  }

  @Test
  public void testStringConvertion() {
    char[] cArray = {'2', '3'};
    assertThat("23".toCharArray(), is(cArray));
  }

  @Test
  public void testRegionMatches() {
    String helloLady = "Hello fella";

    assertTrue(helloLady.regionMatches(false, 9, "young lady", 6, 2));

    System.out.println(helloLady.lastIndexOf("ll"));
    System.out.println(helloLady.lastIndexOf("l"));
  }

  @Test
  public void testFindAllOccurancesInAString() {
    String src =
        "abbabasdfsdcavadasbdjcavcavbadbabsdcbsadvbsdacbsadbasdhvbsdbavbdsavbsdavjadbjvbasdv";
    //      List<Integer> allOccur = allOccurancesOf(src, "ab");
    //      System.out.println(allOccur);
    List<Integer> sth = allOccurancesOf(src, "ab");

    System.out.println(sth);
    Collections.reverse(sth);
    System.out.println(sth);
  }

  private List<Integer> tmpList(String src) {
    List<Integer> tmp = new ArrayList<Integer>();
    Integer index = 0;
    while (index != src.length()) {
      tmp.add(index);
      index++;
    }
    System.out.println(tmp.size());

    return tmp;
  }

  private List<Integer> allOccurancesOf(String source, String subString) {
    List<Integer> indexesOfSubstr = new ArrayList<>();

    int lastPositionOfSubstring = 0;
    while (lastPositionOfSubstring <= source.lastIndexOf(subString)) {
      indexesOfSubstr.add(source.indexOf(subString, lastPositionOfSubstring));

      lastPositionOfSubstring = indexesOfSubstr.get(indexesOfSubstr.size() - 1) + 1;
    }

    return indexesOfSubstr;
  }

  @Test
  public void testStringBuilder() {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity());
    for (int i = 0; i < 20; i++) {
      sb.append("Hello");
      System.out.println("cap " + sb.capacity() + " :: len " + sb.length() + " :: " + sb);
    }
  }
}

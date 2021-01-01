/* 
 * Copyright (C) 2021 mon_mode   0mon.mode@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.monmo.jsontest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author nv3ob61
 */
public class Main {

  public static final String URL
          = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false";

  public static void main(String[] args) throws MalformedURLException, IOException {
    //create a URL object with the url
    URL url = new URL(URL);

    // try to open InputStream and read all lines from url.stream
    try (InputStream is = url.openStream();
            Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {

      // gsonBuilder instance
      GsonBuilder gb = new GsonBuilder();
      // create new json from builder
      Gson gson = gb.create();

      // simple array based in CoinEntity
      CoinEntity[] td = gson.fromJson(reader, CoinEntity[].class);
      
      //console out
      System.out.println("                     COIN - PRICE");
      System.out.println("                 --------------------");
      
      for (CoinEntity td1 : td) {
        System.out.println(String.format("%25s - %.2f", 
                td1.getId(), td1.getCurrentPrice()));
      }
      System.out.println("---");
      System.out.println("FIN....");

    }
  }
}

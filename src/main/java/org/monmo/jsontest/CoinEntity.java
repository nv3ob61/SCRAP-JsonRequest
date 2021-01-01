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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author nv3ob61
 */
public class CoinEntity implements Serializable {

  private final static long serialVersionUID = -6148532140063257736L;

  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("symbol")
  @Expose
  private String symbol;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("image")
  @Expose
  private String image;
  @SerializedName("current_price")
  @Expose
  private Double currentPrice;
  @SerializedName("market_cap")
  @Expose
  private Long marketCap;
  @SerializedName("market_cap_rank")
  @Expose
  private Long marketCapRank;
  @SerializedName("fully_diluted_valuation")
  @Expose
  private Long fullyDilutedValuation;
  @SerializedName("total_volume")
  @Expose
  private Long totalVolume;
  @SerializedName("high_24h")
  @Expose
  private Double high24h;
  @SerializedName("low_24h")
  @Expose
  private Double low24h;
  @SerializedName("price_change_24h")
  @Expose
  private Double priceChange24h;
  @SerializedName("price_change_percentage_24h")
  @Expose
  private Double priceChangePercentage24h;
  @SerializedName("market_cap_change_24h")
  @Expose
  private Double marketCapChange24h;
  @SerializedName("market_cap_change_percentage_24h")
  @Expose
  private Double marketCapChangePercentage24h;
  @SerializedName("circulating_supply")
  @Expose
  private Double circulatingSupply;
  @SerializedName("total_supply")
  @Expose
  private Double totalSupply;
  @SerializedName("max_supply")
  @Expose
  private Double maxSupply;
  @SerializedName("ath")
  @Expose
  private Double ath;
  @SerializedName("ath_change_percentage")
  @Expose
  private Double athChangePercentage;
  @SerializedName("ath_date")
  @Expose
  private String athDate;
  @SerializedName("atl")
  @Expose
  private Double atl;
  @SerializedName("atl_change_percentage")
  @Expose
  private Double atlChangePercentage;
  @SerializedName("atl_date")
  @Expose
  private String atlDate;
  @SerializedName("roi")
  @Expose
  private Object roi;
  @SerializedName("last_updated")
  @Expose
  private String lastUpdated;

  /**
   * No args constructor for use in serialization
   *
   */
  public CoinEntity() {
  }

  /**
   *
   * @param totalVolume
   * @param symbol
   * @param marketCapRank
   * @param low24h
   * @param roi
   * @param circulatingSupply
   * @param lastUpdated
   * @param high24h
   * @param ath
   * @param marketCapChangePercentage24h
   * @param atl
   * @param marketCapChange24h
   * @param id
   * @param maxSupply
   * @param image
   * @param marketCap
   * @param totalSupply
   * @param atlDate
   * @param currentPrice
   * @param athDate
   * @param atlChangePercentage
   * @param priceChangePercentage24h
   * @param name
   * @param fullyDilutedValuation
   * @param priceChange24h
   * @param athChangePercentage
   */
  public CoinEntity(String id, String symbol, String name, String image,
          Double currentPrice, Long marketCap, Long marketCapRank,
          Long fullyDilutedValuation, Long totalVolume,
          Double high24h, Double low24h, Double priceChange24h,
          Double priceChangePercentage24h, Double marketCapChange24h,
          Double marketCapChangePercentage24h, Double circulatingSupply,
          Double totalSupply, Double maxSupply, Double ath, Double athChangePercentage, String athDate, Double atl, Double atlChangePercentage, String atlDate, Object roi, String lastUpdated) {
    super();
    this.id = id;
    this.symbol = symbol;
    this.name = name;
    this.image = image;
    this.currentPrice = currentPrice;
    this.marketCap = marketCap;
    this.marketCapRank = marketCapRank;
    this.fullyDilutedValuation = fullyDilutedValuation;
    this.totalVolume = totalVolume;
    this.high24h = high24h;
    this.low24h = low24h;
    this.priceChange24h = priceChange24h;
    this.priceChangePercentage24h = priceChangePercentage24h;
    this.marketCapChange24h = marketCapChange24h;
    this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    this.circulatingSupply = circulatingSupply;
    this.totalSupply = totalSupply;
    this.maxSupply = maxSupply;
    this.ath = ath;
    this.athChangePercentage = athChangePercentage;
    this.athDate = athDate;
    this.atl = atl;
    this.atlChangePercentage = atlChangePercentage;
    this.atlDate = atlDate;
    this.roi = roi;
    this.lastUpdated = lastUpdated;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CoinEntity withId(String id) {
    this.id = id;
    return this;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CoinEntity withSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CoinEntity withName(String name) {
    this.name = name;
    return this;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public CoinEntity withImage(String image) {
    this.image = image;
    return this;
  }

  public Double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public CoinEntity withCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  public Long getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(Long marketCap) {
    this.marketCap = marketCap;
  }

  public CoinEntity withMarketCap(Long marketCap) {
    this.marketCap = marketCap;
    return this;
  }

  public Long getMarketCapRank() {
    return marketCapRank;
  }

  public void setMarketCapRank(Long marketCapRank) {
    this.marketCapRank = marketCapRank;
  }

  public CoinEntity withMarketCapRank(Long marketCapRank) {
    this.marketCapRank = marketCapRank;
    return this;
  }

  public Long getFullyDilutedValuation() {
    return fullyDilutedValuation;
  }

  public void setFullyDilutedValuation(Long fullyDilutedValuation) {
    this.fullyDilutedValuation = fullyDilutedValuation;
  }

  public CoinEntity withFullyDilutedValuation(Long fullyDilutedValuation) {
    this.fullyDilutedValuation = fullyDilutedValuation;
    return this;
  }

  public Long getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
  }

  public CoinEntity withTotalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

  public Double getHigh24h() {
    return high24h;
  }

  public void setHigh24h(Double high24h) {
    this.high24h = high24h;
  }

  public CoinEntity withHigh24h(Double high24h) {
    this.high24h = high24h;
    return this;
  }

  public Double getLow24h() {
    return low24h;
  }

  public void setLow24h(Double low24h) {
    this.low24h = low24h;
  }

  public CoinEntity withLow24h(Double low24h) {
    this.low24h = low24h;
    return this;
  }

  public Double getPriceChange24h() {
    return priceChange24h;
  }

  public void setPriceChange24h(Double priceChange24h) {
    this.priceChange24h = priceChange24h;
  }

  public CoinEntity withPriceChange24h(Double priceChange24h) {
    this.priceChange24h = priceChange24h;
    return this;
  }

  public Double getPriceChangePercentage24h() {
    return priceChangePercentage24h;
  }

  public void setPriceChangePercentage24h(Double priceChangePercentage24h) {
    this.priceChangePercentage24h = priceChangePercentage24h;
  }

  public CoinEntity withPriceChangePercentage24h(Double priceChangePercentage24h) {
    this.priceChangePercentage24h = priceChangePercentage24h;
    return this;
  }

  public Double getMarketCapChange24h() {
    return marketCapChange24h;
  }

  public void setMarketCapChange24h(Double marketCapChange24h) {
    this.marketCapChange24h = marketCapChange24h;
  }

  public CoinEntity withMarketCapChange24h(Double marketCapChange24h) {
    this.marketCapChange24h = marketCapChange24h;
    return this;
  }

  public Double getMarketCapChangePercentage24h() {
    return marketCapChangePercentage24h;
  }

  public void setMarketCapChangePercentage24h(Double marketCapChangePercentage24h) {
    this.marketCapChangePercentage24h = marketCapChangePercentage24h;
  }

  public CoinEntity withMarketCapChangePercentage24h(Double marketCapChangePercentage24h) {
    this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    return this;
  }

  public Double getCirculatingSupply() {
    return circulatingSupply;
  }

  public void setCirculatingSupply(Double circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
  }

  public CoinEntity withCirculatingSupply(Double circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
    return this;
  }

  public Double getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(Double totalSupply) {
    this.totalSupply = totalSupply;
  }

  public CoinEntity withTotalSupply(Double totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

  public Double getMaxSupply() {
    return maxSupply;
  }

  public void setMaxSupply(Double maxSupply) {
    this.maxSupply = maxSupply;
  }

  public CoinEntity withMaxSupply(Double maxSupply) {
    this.maxSupply = maxSupply;
    return this;
  }

  public Double getAth() {
    return ath;
  }

  public void setAth(Double ath) {
    this.ath = ath;
  }

  public CoinEntity withAth(Double ath) {
    this.ath = ath;
    return this;
  }

  public Double getAthChangePercentage() {
    return athChangePercentage;
  }

  public void setAthChangePercentage(Double athChangePercentage) {
    this.athChangePercentage = athChangePercentage;
  }

  public CoinEntity withAthChangePercentage(Double athChangePercentage) {
    this.athChangePercentage = athChangePercentage;
    return this;
  }

  public String getAthDate() {
    return athDate;
  }

  public void setAthDate(String athDate) {
    this.athDate = athDate;
  }

  public CoinEntity withAthDate(String athDate) {
    this.athDate = athDate;
    return this;
  }

  public Double getAtl() {
    return atl;
  }

  public void setAtl(Double atl) {
    this.atl = atl;
  }

  public CoinEntity withAtl(Double atl) {
    this.atl = atl;
    return this;
  }

  public Double getAtlChangePercentage() {
    return atlChangePercentage;
  }

  public void setAtlChangePercentage(Double atlChangePercentage) {
    this.atlChangePercentage = atlChangePercentage;
  }

  public CoinEntity withAtlChangePercentage(Double atlChangePercentage) {
    this.atlChangePercentage = atlChangePercentage;
    return this;
  }

  public String getAtlDate() {
    return atlDate;
  }

  public void setAtlDate(String atlDate) {
    this.atlDate = atlDate;
  }

  public CoinEntity withAtlDate(String atlDate) {
    this.atlDate = atlDate;
    return this;
  }

  public Object getRoi() {
    return roi;
  }

  public void setRoi(Object roi) {
    this.roi = roi;
  }

  public CoinEntity withRoi(Object roi) {
    this.roi = roi;
    return this;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public CoinEntity withLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("id", id).append("symbol", symbol).append("name", name).append("image", image).append("currentPrice", currentPrice).append("marketCap", marketCap).append("marketCapRank", marketCapRank).append("fullyDilutedValuation", fullyDilutedValuation).append("totalVolume", totalVolume).append("high24h", high24h).append("low24h", low24h).append("priceChange24h", priceChange24h).append("priceChangePercentage24h", priceChangePercentage24h).append("marketCapChange24h", marketCapChange24h).append("marketCapChangePercentage24h", marketCapChangePercentage24h).append("circulatingSupply", circulatingSupply).append("totalSupply", totalSupply).append("maxSupply", maxSupply).append("ath", ath).append("athChangePercentage", athChangePercentage).append("athDate", athDate).append("atl", atl).append("atlChangePercentage", atlChangePercentage).append("atlDate", atlDate).append("roi", roi).append("lastUpdated", lastUpdated).toString();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(totalVolume).append(symbol).append(marketCapRank).append(low24h).append(roi).append(circulatingSupply).append(lastUpdated).append(high24h).append(ath).append(marketCapChangePercentage24h).append(atl).append(marketCapChange24h).append(id).append(maxSupply).append(image).append(marketCap).append(totalSupply).append(atlDate).append(currentPrice).append(athDate).append(atlChangePercentage).append(priceChangePercentage24h).append(name).append(fullyDilutedValuation).append(priceChange24h).append(athChangePercentage).toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof CoinEntity) == false) {
      return false;
    }
    CoinEntity rhs = ((CoinEntity) other);
    return new EqualsBuilder().append(totalVolume, rhs.totalVolume).append(symbol, rhs.symbol).append(marketCapRank, rhs.marketCapRank).append(low24h, rhs.low24h).append(roi, rhs.roi).append(circulatingSupply, rhs.circulatingSupply).append(lastUpdated, rhs.lastUpdated).append(high24h, rhs.high24h).append(ath, rhs.ath).append(marketCapChangePercentage24h, rhs.marketCapChangePercentage24h).append(atl, rhs.atl).append(marketCapChange24h, rhs.marketCapChange24h).append(id, rhs.id).append(maxSupply, rhs.maxSupply).append(image, rhs.image).append(marketCap, rhs.marketCap).append(totalSupply, rhs.totalSupply).append(atlDate, rhs.atlDate).append(currentPrice, rhs.currentPrice).append(athDate, rhs.athDate).append(atlChangePercentage, rhs.atlChangePercentage).append(priceChangePercentage24h, rhs.priceChangePercentage24h).append(name, rhs.name).append(fullyDilutedValuation, rhs.fullyDilutedValuation).append(priceChange24h, rhs.priceChange24h).append(athChangePercentage, rhs.athChangePercentage).isEquals();
  }
}

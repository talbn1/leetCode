package com.talbn1.leetCode.arrays.success;

//#Array
//#Dynamic Programming

class best_time_to_buy_and_sell_stock_121_acc {
    
    public static void main(String[] args) {
        
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1)); // Expected: 5
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2)); // Expected: 0
        
        int[] prices3 = {2, 4, 1, 6};
        System.out.println(maxProfit(prices3)); // Expected: 5
        
        int[] prices4 = {3, 2, 6, 5, 0, 3};
        System.out.println(maxProfit(prices4)); // Expected: 4
        
        int[] prices5 = {1, 2};
        System.out.println(maxProfit(prices5)); // Expected: 1
        
    int[] prices6 = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(prices6)); // Expected: 0
        
        int[] prices7 = {2, 1, 2, 1, 2, 1, 2, 1};
        System.out.println(maxProfit(prices7)); // Expected: 1
        
        int[] prices8 = {2, 1, 4};
        System.out.println(maxProfit(prices8)); // Expected: 3
        
        int[] prices9 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices9)); // Expected: 4
        
        int[] prices10 = {414,863,393,674,205,793,229,379,37,455,594,36,312,667,441,411,514,344,681,359,865,124,984,670,509,337,495,266,275,356,26,229,51,557,292,975,551,985,445,710,467,31,890,694,127,349,631,322,595,59,433,173,944,305,662,379,864,835,355,411,506,10,716,918,872,716,887,453,706,416,245,611,6,403,894,94,852,733,890,131,481,723,571,335,695,475,112,245,389,754,439,990,771,282,935,746,422,627,570,101,212,248,123,633,842,110,272,352,910,926,726,502,396,49,444,581,504,145,765,710,785,126,232,386,245,613,43,591,638,179,438,838,5,486,170,960,273,347,8,176,884,569,528,442,839,573,953,102,802,659,51,675,110,76,531,783,539,806,363,333,214,919,473,303,690,917,793,2,504,7,584,734,527,561,484,648,622,123,655,977,235,999,714,963,921,801,237,752,127,484,772,483,62,544,938,845,218,32,832,174,561,635,44,903,972,550,291,12,234,24,750,182,257,265,276,926,409,865,170,587,35,813,628,991,829,573,226,69,979,188,285,582,276,951,114,634,797,720,306,365,862,416,8,174,446,555,132,578,152,582,214,673,156,899,613,871,789,378,434,464,532,356,884,83,744,126,773,537,149,723,653,967,574,87,463,312,416,3,667,339,471,237,540,860,709,867,474,769,344,52,633,784,199,239,735,362,131,14,376,683,532,154,618,505,773,970,207,208,926,192,273,338,282,874,679,932,67,593,412,932,807,456,637,360,988,839,345,890,409,316,535,123,234,480,368,515,98,486,343,79,989,768,443,943,628,184,452,379,557,265,904,327,353,698,158,148,133,972,179,934,90,976,199,187,142,126,55,764,64,593,310,284,307,43,855,51,382,483,251,601,675,723,467,501,217,896,433,759,156,979,954,802,308,591,637,920,867,411,82,433,320,548,571,254,771,597,761,93,106,163,662,500,764,587,801,876,338,431,771,824,219};
        System.out.println(maxProfit(prices10)); // Expected: 4
        
    }
    
    public static int maxProfit(int[] prices) {
        
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxPriceSoFar = 0;
        int maxDiffPositive = 0;
        int tempDiffPositive = 0;
        int minPosition = 0;
        int maxPosition = 0;
        
        for (int i = 0; i < prices.length; i++) {
            
            if (prices[i] > maxPriceSoFar) {
                maxPriceSoFar = prices[i];
                maxPosition = i;
            }
            if (prices[i] < minPriceSoFar) {
                minPriceSoFar = prices[i];
                minPosition = i;
            }
                if (maxPriceSoFar > minPriceSoFar && minPosition <= maxPosition) {
                    tempDiffPositive = maxPriceSoFar - minPriceSoFar;
                }
                if (tempDiffPositive > maxDiffPositive) {
                    maxDiffPositive = tempDiffPositive;
                }
            
            maxPriceSoFar = 0;
        }
        return maxDiffPositive;
    }
}
/*
    [2][4][1]
     |
    [2][4][1]
     |
     2-2 = 0
-------------
    [2][4][1]
     |
    [2][4][1]
        |
     4-2 = 2
     
 -------------
    [2][4][1]
     |
    [2][4][1]
           |
     1-2 = -1
     
*/

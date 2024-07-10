package com.winter.app.trades;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.DefaultTest;

public class TradeServiceTest extends DefaultTest {

	@Autowired
	private TradeService tradeService;

	@Test
	public void transferTest() throws Exception {
		tradeService.trade();

		System.out.println("종료");
	}

}
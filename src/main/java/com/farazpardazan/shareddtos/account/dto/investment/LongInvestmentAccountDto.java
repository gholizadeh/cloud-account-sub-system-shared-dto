package com.farazpardazan.shareddtos.account.dto.investment;

import com.farazpardazan.shareddtos.account.dto.InvestmentAccountDto;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * حساب سرمایه گذاری بلند مدت
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeName(value = "LONG_INVESTMENT")
public class LongInvestmentAccountDto extends InvestmentAccountDto {
}

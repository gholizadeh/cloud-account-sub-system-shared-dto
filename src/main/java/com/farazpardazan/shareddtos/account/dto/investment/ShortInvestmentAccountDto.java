package com.farazpardazan.shareddtos.account.dto.investment;

import com.farazpardazan.shareddtos.account.dto.InvestmentAccountDto;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * حساب سرمایه گذاری کوتاه مدت
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeName(value = "SHORT_INVESTMENT")
public class ShortInvestmentAccountDto extends InvestmentAccountDto {
}

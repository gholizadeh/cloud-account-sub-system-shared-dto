package com.farazpardazan.shareddtos.account.dto.deposit;

import com.farazpardazan.shareddtos.account.dto.DepositAccountDto;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 *حساب سپرده جاری
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeName(value = "DEBT_DEPOSIT")
public class DebtDepositAccountDto extends DepositAccountDto {
}

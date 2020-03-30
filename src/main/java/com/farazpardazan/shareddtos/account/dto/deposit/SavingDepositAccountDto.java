package com.farazpardazan.shareddtos.account.dto.deposit;

import com.farazpardazan.shareddtos.account.dto.DepositAccountDto;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 *حساب سپرده قرض الحسنه پس انداز
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeName(value = "SAVING_DEPOSIT")
public class SavingDepositAccountDto extends DepositAccountDto {
}

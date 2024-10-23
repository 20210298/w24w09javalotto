package kr.ac.kumoh.s202102298.w24w09javalotto.Repository;

import kr.ac.kumoh.s202102298.w24w09javalotto.model.LottoNumber;

public interface LottoRepository {
    LottoNumber save(LottoNumber lottoNumber);
    LottoNumber find();
}

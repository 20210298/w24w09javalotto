package kr.ac.kumoh.s202102298.w24w09javalotto.Repository;

import kr.ac.kumoh.s202102298.w24w09javalotto.model.LottoNumber;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryLottoRepository implements LottoRepository {

    private LottoNumber storedLottoNumber = null;

    @Override
    public LottoNumber save(LottoNumber lottoNumber) {
        this.storedLottoNumber = lottoNumber;

        return storedLottoNumber;
    }

    @Override
    public LottoNumber find() {
        return storedLottoNumber;
    }
}

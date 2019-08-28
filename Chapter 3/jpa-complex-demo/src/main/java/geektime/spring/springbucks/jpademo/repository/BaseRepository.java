package geektime.spring.springbucks.jpademo.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * 通用的repository
 * @param <T>
 * @param <Long>
 */
@NoRepositoryBean//spring不会生成bean
public interface BaseRepository<T, Long> extends PagingAndSortingRepository<T, Long> {

    //TOP3  查询top3
    List<T> findTop3ByOrderByUpdateTimeDescIdAsc();
}

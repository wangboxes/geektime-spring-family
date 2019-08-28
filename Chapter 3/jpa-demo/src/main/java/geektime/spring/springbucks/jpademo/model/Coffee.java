package geektime.spring.springbucks.jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.joda.money.Money;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_MENU")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column
    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount",
            parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode", value = "CNY")})
    private Money price;//TODO 金钱处理

    @Column(updatable = false)//不能更新
    //(只在保存的时候自动设置时间一次)The property value will be set to the current VM date exactly once when saving the owning entity for the first time.
    @CreationTimestamp
    private Date createTime;

    //(每次更新都会自动设置时间)The property value will be set to the current VM date whenever the owning entity is updated.
    @UpdateTimestamp
    private Date updateTime;

}

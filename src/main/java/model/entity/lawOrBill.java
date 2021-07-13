package model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(
    name = "supporters",
    indexes = {
        @Index(columnList = "author, signers", unique = true)
    }

)

public class lawOrBill {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  //entryId represents both law and bill ID's
  @Column(name = "entryId", nullable = false,unique = true)
  private long id;

  @CreationTimestamp
  @Temporal(TemporalType.DATE)
  @Column(nullable = false, updatable = true)
  private Date creationDate;

  @Column(nullable = false)
  private String author;

  @Column(nullable = false)
  private String signers;

  //type"bill or law"
  @Column(nullable = false)
  private String type;

  @Column(nullable = false)
  private String agency;






}

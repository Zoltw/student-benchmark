import style from './User.module.css';
import Page from '@components/Page/PageWithoutUser';
import ContainerBox from '@components/ContainerBox/ContainerBox';
import ButtonMedium from '@components/Buttons/ButtonMedium';
import ButtonGrey from '@components/Buttons/ButtonGrey';
import { Link } from 'react-router-dom';
import userAvatar from '../../components/UserProfile/defaultAvatar.svg';

function User() {
  return (
    <Page>
      <ContainerBox width={'140rem'}>
        <img src={userAvatar} className={style.userAvatar} alt={'Default Avatar'} />
        <div className={style.userBar}>
          <span className={style.username}>UserWithLongUsername</span>
        </div>
        <div className={style.buttons}>
          <Link to='/dashboard'>
            <ButtonGrey text={'Dashboard'} width={'32rem'}/>
          </Link>
          <Link to='/password'>
            <ButtonGrey text={'Change Password'} width={'32rem'}/>
          </Link>
          <Link to='/delete'>
            <ButtonGrey text={'Delete Account'} width={'32rem'} />
          </Link>
        </div>
        <ButtonMedium text={'Log Out'} width={'25rem'}/>
      </ContainerBox>
    </Page>
  );
}


export default User;
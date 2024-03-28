import Intro from "../../components/intro";

import localFont from '@next/font/local'
const myFont = localFont(
  {src: '../../public/fonts/STARFLOWER.otf'},
  )

export default function Home() {
  return (
    <main className=" flex flex-col items-center px-4 pb-[5000px] mt-10">
      <Intro />
    </main>
  );
}
